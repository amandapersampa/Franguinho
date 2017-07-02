import json

from flask import jsonify, render_template
from app.main.forms.Pedido_forms import Pedido_forms

from app import app

@app.route("/itemCardapio/cadastro", methods=["GET", "POST"])
def cadastro_item_cardapio():
    form = Pedido_forms()

   # if form.is_submitted():
    return render_template('cadastro_item_cardapio.html', form=form)