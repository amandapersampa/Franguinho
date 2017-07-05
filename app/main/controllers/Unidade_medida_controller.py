# coding=utf-8
from flask import jsonify
from flask import render_template,flash,redirect,url_for

from app import app
from app.main.forms.Unidade_medida_forms import Unidade_medida_forms
from app.main.models.Unidade_medida import Unidade_medida_dao
from app.main.service.Unidade_medida_service import Unidade_medida_service
from app.main.util import to_string

service = Unidade_medida_service()

@app.route("/unidadeMedida")
def salva_unidade_medida():
    unidade = Unidade_medida_dao("M")
    return jsonify(service.salvar(unidade))

@app.route("/unidadeMedida/list")
def findAll_unidade():
    resultados = create_cols(service.findAll())
    page = {
        "titles": ["Código", "Unidade"],
        "header": "Unidade de Medida",
        "table": "Unidades de Medidas Cadastradas"
    }
    return render_template("listar.html", page=page, resultados=resultados)


@app.route("/unidadeMedida/<id>")
def findById_unidade(id):
    service.findById(id)
    return 'ok'


@app.route("/unidadeMedida/cadastro", methods=["GET", "POST"])
def cadastro_unidade_medida():
    form = Unidade_medida_forms()

    if form.is_submitted():
        unidade = Unidade_medida_dao(form.nome.data)
        service.salvar(unidade)

    return render_template('cadastro_unidade_medida.html', form=form)

def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_unidade_medida)
        resultado['col2'] = to_string(list[i].nome)
        lista.append(resultado)
    return lista