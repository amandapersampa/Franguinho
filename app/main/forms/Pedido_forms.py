from flask_wtf import FlaskForm
from wtforms import *
from wtforms.validators import DataRequired

class Pedido_forms(FlaskForm):
    data = DateField("date", validators=[DataRequired()])
    item_cardapio=[]
