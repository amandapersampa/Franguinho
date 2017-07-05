# coding=utf-8

from flask import jsonify
from flask import render_template,flash,redirect,url_for

from app import app
from app.main.forms.Produto_forms import Produto_forms
from app.main.models.Produto import Produto_dao
from app.main.service.Produto_service import Produto_service
from app.main.service.Unidade_medida_service import Unidade_medida_service
from app.main.util import to_string

service = Produto_service()

@app.route("/produto")
def produto():
    return render_template("produto.html")

@app.route("/produto/list")
def lista_todos():
    page={
    "titles": ["Código", "Produto", "Quantidade", "Unidade"],
        "header": "Produtos",
        "table": "Produtos Cadastrados"
  }
    resultados = create_cols(service.findAll())
    return render_template("listar.html", page=page, resultados=resultados)


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


@app.route("/produto/cadastro", methods=["GET", "POST"])
def cadastro():
    form = Produto_forms()

    form.unidade_medida.choices = [(row.id_unidade_medida, row.nome) for row in Unidade_medida_service.findAll()]
    if form.is_submitted():
        produto = Produto_dao(str(form.nome.data),form.unidade_medida.data, 0, form.quantidade_minima.data, form.item_cardapio.data)
        service.salvar(produto)

    return render_template('cadastroProduto.html', form=form)

def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_produto)
        resultado['col2'] = to_string(list[i].nome)
        resultado['col3'] = to_string(list[i].quantidade)
        resultado['col5'] = to_string(list[i].unidade.nome)
        lista.append(resultado)
    return lista