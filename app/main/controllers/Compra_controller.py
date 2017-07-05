# coding=utf-8

from app.main.models.Compra import Compra_dao
from flask import jsonify
from flask import render_template,flash,redirect,url_for

from app import app
from app.main.forms.Compra_forms import Compra_forms
from app.main.models.Produto import Produto_dao
from app.main.service.Compra_service import Compra_service
from app.main.util import to_string
@app.route("/compra")
def compra():
    return render_template("compra.html")


@app.route("/compra/list")
def lista_todos_compra():
    service = Compra_service()
    page = {
        "titles": ["Código", "Produto", "Quantidade", "Valor", "Data da Compra"],
        "header": "Compras",
        "table": "Compras Cadastradas"
    }
    resultados=create_cols(service.findAll())
    return render_template("listar.html", page=page, resultados=resultados)

@app.route("/compra/cadastro", methods=["GET", "POST"])
def cadastro_compra():
    form = Compra_forms()

    form.produto.choices = [(row.id_produto, row.nome) for row in Produto_dao.findAll()]
    print(form.data)
    if form.is_submitted():
        service = Compra_service()
        compra = Compra_dao(form.quantidade.data, form.valor.data, form.data.data, form.produto.data)
        service.salvar(compra)


    return render_template('cadastro_compra.html', form=form)

def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_compra)
        resultado['col2'] = to_string(list[i].produto.nome)
        resultado['col3'] = to_string(list[i].quantidade)
        resultado['col4'] = to_string(list[i].valor)
        resultado['col5'] = to_string(list[i].data)
        lista.append(resultado)
    return lista


