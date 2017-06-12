import json

from app.main.service.Produto_service import Produto_service
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
    print("dumps",json.dumps(service.findAll()))
    return jsonify(service.findAll())

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