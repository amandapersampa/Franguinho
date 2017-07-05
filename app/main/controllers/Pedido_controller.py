
#from builtins import print
from flask import jsonify, render_template, redirect, url_for
from pandas.core.internals import form_blocks

from app.main.forms.Pedido_forms import Pedido_forms
from app.main.forms.modal_item_cardapio import modal_item_cardapio
from app.main.models.Item_cardapio import Item_cardapio_dao
from app.main.models.pedido import pedido_dao
from app.main.util import to_string

from app import app

@app.route("/pedido", methods=["GET", "POST"])
def pedido():
    return render_template("pedido.html")

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

@app.route("/pedido/list", methods=["GET", "POST"])
def lista_todos_pedidos():
    form = Pedido_forms()
#    form.produto.choices = [(row.id_produto, row.nome) for row in Produto_dao.findAll()]
#    if form.is_submitted():
#        item = Item_cardapio_dao(str(form.nome.data), form.valor.data, form.produto.data, form.qtd_ingrediente.data,
#                                 form.qtd_item_extra.data, form.tipo_item.data)
#        service.salvar(item)
    return render_template('listar.html', form=form)

def create_cols(list):
    lista = []
    for i in range(len(list)):
        resultado = dict()
        resultado['col1'] = to_string(list[i].id_produto)
        resultado['col2'] = to_string(list[i].nome)
        resultado['col3'] = to_string(list[i].quantidade)
        resultado['col4'] = to_string(list[i].qtd_minima)
        # resultado['col1'] = list[i].item_estoque_vld
        # resultado['col1'] = list[i].compra
        # resultado['col5'] = list[i].id_unidade_medida
        resultado['col5'] = to_string(list[i].unidade.nome)
        lista.append(resultado)
    return lista