# coding=utf-8
from flask import jsonify
from flask import render_template,flash,redirect,url_for

from app import app
from app.main.forms.Unidade_medida_forms import Unidade_medida_forms
from app.main.models.Unidade_medida import Unidade_medida_dao
from app.main.service.Unidade_medida_service import Unidade_medida_service

service = Unidade_medida_service()

@app.route("/unidadeMedida")
def salva_unidade_medida():
    unidade = Unidade_medida_dao("M")
    return jsonify(service.salvar(unidade))

@app.route("/unidadeMedida/list")
def findAll_unidade():
    resultado = service.findAll()
    nome = {
        "titles": ["Código", "Unidade", "Ações"],
    }
    return render_template("lista_unidade_medida.html", nome=nome, produtos=resultado)


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