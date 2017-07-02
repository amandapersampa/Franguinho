from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Item_cardapio_forms(FlaskForm):
    item_cardapio = SelectField('item_cardapio')
    quantidade = IntegerField("quatidade", validators=[DataRequired()])
    lista_item_exta =[]


