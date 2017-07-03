from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired
from werkzeug.datastructures import MultiDict

class modal_item_cardapio(FlaskForm):
    item_cardapio = SelectField('item_cardapio')
    quantidade = IntegerField("quatidade", validators=[DataRequired()])
    lista_item_exta =[]

    def reset(self):
        blankData = MultiDict([('csrf_token', self.reset)])
        self.process(blankData)




