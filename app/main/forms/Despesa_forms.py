# coding=utf-8
from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Despesa_forms(FlaskForm):
    tipo = SelectField('tipo', choices=[('manuntecao', 'Manutenção'), ('sevico', 'Serviço'), ('aluguel', 'Aluguel'),('luz', 'Luz')])
    valor = FloatField("valor", validators=[DataRequired()])
    data = DateField("date", validators=[DataRequired()])
    nome = StringField("nome", validators=[DataRequired()])
    descricao = StringField("desciecao", validators=[DataRequired()])