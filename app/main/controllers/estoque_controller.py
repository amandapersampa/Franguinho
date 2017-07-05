# coding=utf-8

from flask import jsonify
from flask import render_template, flash, redirect, url_for

from app import app
from app.main.forms.Produto_forms import Produto_forms
from app.main.models.Produto import Produto_dao
from app.main.service.Produto_service import Produto_service
from app.main.service.Unidade_medida_service import Unidade_medida_service
from app.main.util import to_string

service = Produto_service()

@app.route("/estoque/list")
def lista_estoque():
    page = {
        "titles": ["Código", "Produto", "Quantidade Atual", "Quantidade Minima", "Unidade"],
        "header": "Estoque",
        "table": "Produtos no Estoque"
    }
    resultados = create_cols(service.findAll())
    return render_template("listar.html", page=page, resultados=resultados)

def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_produto)
        resultado['col2'] = to_string(list[i].nome)
        resultado['col3'] = to_string(list[i].quantidade)
        resultado['col4'] = to_string(list[i].qtd_minima)
        resultado['col5'] = to_string(list[i].unidade.nome)
        lista.append(resultado)
    return lista