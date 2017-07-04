# coding=utf-8
import json

from flask import render_template

from app import app
from app.main.service.Despesa_service import Despesa_service
from app.main.models.Despesa import Despesa_dao
from app.main.forms.Despesa_forms import Despesa_forms

service = Despesa_service()

@app.route("/despesa")
def despesa():
    return render_template("despesa.html")

@app.route("/despesa/list")
def lista_despesa():
    service.findAll()
    nome = {
        "titles": ["Código","Data", "Nome", "Descrição", "Tipo", "Valor", "Ações"]
  }
    resultado = service.findAll()
    return render_template("listar_despesa.html", nome=nome, despesas=resultado)


@app.route("/despesa/cadastro", methods=["GET", "POST"])
def cadastro_despesa():
    form = Despesa_forms()
    if form.is_submitted():
        item = Despesa_dao(form.valor.data, form.descricao.data, form.tipo.data, form.data.data, form.nome.data)
        service.salvar(item)
    return render_template('cadastro_despesa.html', form=form)