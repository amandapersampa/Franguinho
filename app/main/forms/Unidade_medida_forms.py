# coding=utf-8
from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Unidade_medida_forms(FlaskForm):
    nome = StringField('produto', validators=[DataRequired()])
