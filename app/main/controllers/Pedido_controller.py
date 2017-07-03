import json

#from builtins import print
from flask import jsonify, render_template, redirect, url_for
from pandas.core.internals import form_blocks

from app.main.forms.Pedido_forms import Pedido_forms
from app.main.forms.modal_item_cardapio import modal_item_cardapio
from app.main.models.Item_cardapio import Item_cardapio_dao

from app import app

@app.route("/pedido/cadastro", methods=["GET", "POST"])
def cadastro_pedido():
    form = Pedido_forms()
    formModal = modal_item_cardapio()
    formModal.item_cardapio.choices = [(row.id_item_cardapio ,row.nome) for row in Item_cardapio_dao.findAll()]
    if formModal.is_submitted():
        formModal.item = Item_cardapio_dao.find_by_id(formModal.item_cardapio.data)
        form.item_cardapio.append(formModal)
        return redirect("pedido/cadastro")

    if form.is_submitted():
        print("teste")


    return render_template('cadastro_pedido.html', form=form, form_modal =formModal)