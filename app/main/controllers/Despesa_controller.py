# coding=utf-8
import json

from flask import render_template

from app import app
from app.main.service.Despesa_service import Despesa_service
from app.main.models.Despesa import Despesa_dao
from app.main.forms.Despesa_forms import Despesa_forms
from app.main.util import to_string

service = Despesa_service()


@app.route("/despesa")
def despesa():
    return render_template("despesa.html")


@app.route("/despesa/list")
def lista_despesa():
    page = {
        "titles": ["Código", "Data", "Nome", "Descrição", "Tipo", "Valor"],
        "header": "Despesas",
        "table": "Despesas Cadastradas"
    }
    resultados = create_cols(service.findAll())
    return render_template("listar.html", page=page, resultados=resultados)


@app.route("/despesa/cadastro", methods=["GET", "POST"])
def cadastro_despesa():
    form = Despesa_forms()
    if form.is_submitted():
        item = Despesa_dao(form.valor.data, form.descricao.data, form.tipo.data, form.data.data, form.nome.data)
        service.salvar(item)
    return render_template('cadastro_despesa.html', form=form)


def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_despesa)
        resultado['col2'] = to_string(list[i].data)
        resultado['col3'] = to_string(list[i].nome)
        resultado['col4'] = to_string(list[i].descricao)
        resultado['col5'] = to_string(list[i].tipo)
        resultado['col6'] = to_string(list[i].valor)
        lista.append(resultado)
    return lista