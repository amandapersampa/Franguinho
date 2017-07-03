# coding=utf-8
from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Compra_forms(FlaskForm):
    produto = SelectField('produto')
    quantidade = IntegerField("quantidade", validators=[DataRequired()])
    valor = FloatField("quantidade", validators=[DataRequired()])
    data = DateField("date", validators=[DataRequired()])