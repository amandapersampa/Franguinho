from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Compra_forms(FlaskForm):
    produto = SelectField('produto')
    quantidade = IntegerField("quantidade", validators=[DataRequired()])
    valor = IntegerField("quantidade", validators=[DataRequired()])