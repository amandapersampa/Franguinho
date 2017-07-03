from app import db
from sqlalchemy.orm import relationship



class Item_cardapio_dao(db.Model):
    __tablename__ = "itemcardapio"
    id_item_cardapio = db.Column(db.Integer, primary_key=True)
    nome = db.Column(db.String)
    valor = db.Column(db.Float)
    qtd_ingrediente = db.Column(db.Integer)
    qtd_item_extra = db.Column(db.Integer)
    tipo_item = db.Column(db.String)

    id_produto = db.Column(db.Integer, db.ForeignKey('produto.id_produto'))
    produto = relationship("Produto_dao", back_populates="")


    def __init__(self, nome, valor, id_produto, qtd_ingrediente, qtd_item_extra, tipo_item):
        self.nome = nome
        self.valor = valor
        self.id_produto = id_produto
        self.qtd_ingrediente = qtd_ingrediente
        self.qtd_item_extra = qtd_item_extra;
        self.tipo_item = tipo_item

    def salvar(self):
        db.session.add(self)
        db.session.commit()

    def listar(id):
        return Item_cardapio_dao.query.get(id)

    @staticmethod
    def findAll():
        return Item_cardapio_dao.query.all()

    @staticmethod
    def filter_nome(nome):
        return Item_cardapio_dao.query.filter_by(nome=nome).first()

    def __repr__(self):
        return str({"id_produto": self.id_produto, "nome": self.nome, "qtd_ingrediente": self.qtd_ingrediente,
                    "produto": self.produto, "valor":self.valor, "tipo_item" : self.tipo_item, "self.qtd_item_extra":self.qtd_item_extra})
