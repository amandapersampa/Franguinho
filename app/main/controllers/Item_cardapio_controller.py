import json

from flask import jsonify, render_template,flash,redirect,url_for

from app import app
from app.main.service.Item_cardapio_service import Item_cardapio_service
from app.main.models.Item_cardapio import Item_cardapio_dao
from app.main.models.Produto import Produto_dao
from app.main.forms.Item_cardapio_forms import Item_cardapio_forms

service = Item_cardapio_service()

@app.route("/cardapio")
def cardapio():
    return render_template("cardapio.html")

@app.route("/itemCardapio/list")
def lista_Item_cardapio():
    service.findAll()
    nome = {
        "titles": ["Código", "Nome", "Produto", "Quantidade de produto", "Qtd. Itens Extra", "Valor", "Tipo", "Ações"]
  }
    resultado = service.findAll()
    print(resultado)
    return render_template("lista_Item_cardapio.html", nome=nome, resultado=resultado)


@app.route("/itemCardapio/cadastro", methods=["GET", "POST"])
def cadastro_item_cardapio():
    form = Item_cardapio_forms()
    form.produto.choices = [(row.id_produto, row.nome) for row in Produto_dao.findAll()]
    if form.is_submitted():
        item = Item_cardapio_dao(str(form.nome.data), form.valor.data, form.produto.data, form.qtd_ingrediente.data, form.qtd_item_extra.data, form.tipo_item.data)
        service.salvar(item)
    return render_template('cadastro_item_cardapio.html', form=form)