from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired
from werkzeug.datastructures import MultiDict
from app.main.models.Item_cardapio import Item_cardapio_dao

class modal_item_cardapio(FlaskForm):
    item_cardapio = SelectField('item_cardapio')
    item = ''
    quantidade = IntegerField("quatidade", validators=[DataRequired()])
    lista_item_exta =[]

    def reset(self):
        blankData = MultiDict([('csrf_token', self.reset)])
        self.process(blankData)




