# coding=utf-8

import json

from app.main.service.Produto_service import Produto_service
from app.main.service.Unidade_medida_service import Unidade_medida_service
from flask import render_template
from flask import jsonify


from app import app
from app.main.dao.Produto_dao import Produto_dao
from app.main.models.Produto_forms import Produto_forms

service = Produto_service()

@app.route("/produto")
def teste():
    i=Produto_dao("batata", 1, 4, 2, "sim")
    #self, nome, unidade_medida, quantidade, qtd_minima, item_estoque_vld
    return jsonify(service.salvar(i))

@app.route("/produto/list")
def lista_todos():
    service.findAll()
    nome={
    "page": "Compras Registradas",
    "titles": ["Código", "Produto", "Quantidade", "Unidade", "Valor", "Data da Compra", "Ações"],
    "tabela": "Produtos Utilizados no Cardápio Cadastrados"}
    resultado = service.findAll()
    print("testee",resultado)
   # print("qqqqqqqq",resultado[0][0]["id_produto"])
    return render_template("Listar.html", nome=nome, produtos=resultado)
   # return jsonify(service.findAll())

@app.route("/produto/<id>")
def findById_produto(id):
    service.findById(id)
    return 'ok'

@app.route("/produto/update/<id>")
def update_produto(id):
    produto = service.findById(id)
    print(produto.nome)
    service.update(produto)
    return 'ok'


@app.route("/cadastro", methods=["GET", "POST"])
def cadastro():
    form = Produto_forms()

    form.unidade_medida.choices = [(row.id_unidade_medida, row.nome) for row in Unidade_medida_service.findAll()]
    print(form.unidade_medida.data)
    print(form.is_submitted())
    if form.is_submitted():
        print()
        print(form.unidade_medida.data)
        produto = Produto_dao(str(form.nome.data),form.unidade_medida.data , 0, form.quantidade_minima.data, "sim")
        service.salvar(produto)

    return render_template('cadastroProduto.html', form=form)