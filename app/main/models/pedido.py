# coding=utf-8
from app import db
from sqlalchemy.orm import relationship

class pedido_dao:
    __tablename__ = "pedido"
#    id_pedido = db.Column(db.Integer, primary_key=True)
#    nome = db.Column(db.String)
#    valor = db.Column(db.Float)
#    qtd_ingrediente = db.Column(db.Integer)
#    qtd_item_extra = db.Column(db.Integer)
#    tipo_item = db.Column(db.String)
#    item_extra = db.Column(db.String)

#    id_produto = db.Column(db.Integer, db.ForeignKey('produto.id_produto'))
#    produto = relationship("Produto_dao", back_populates="")