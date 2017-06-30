# coding=utf-8

import json

from app.main.service.Produto_service import Produto_service
from flask import render_template
from flask import jsonify

from app import app
from app.main.dao.Produto_dao import Produto_dao

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
