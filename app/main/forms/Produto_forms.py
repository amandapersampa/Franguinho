from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Produto_forms(FlaskForm):
    nome = StringField("nome", validators=[DataRequired()])
    unidade_medida = SelectField('unidade')
    quantidade_minima = IntegerField("quantidade_minima", validators=[DataRequired()])
    item_cardapio = SelectField('item_Cardapio', choices=[('S', 'Sim'), ('N', 'Não')])

