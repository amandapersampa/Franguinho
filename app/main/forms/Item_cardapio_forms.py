from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Item_cardapio_forms(FlaskForm):
    nome = StringField("nome", validators=[DataRequired()])
    produto = SelectField('produto')
    qtd_ingrediente = IntegerField("qtd_ingrediente", validators=[DataRequired()])
    valor = FloatField("valor", validators=[DataRequired()])
    qtd_item_extra= IntegerField("qtd_item_extra", validators=[DataRequired()])
    tipo_item = SelectField('tipo_item' , choices=[('acai', 'Açaí'), ('bebida', 'Bebida'), ('porcao', 'Porção'),('lanche', 'Lanche')])



