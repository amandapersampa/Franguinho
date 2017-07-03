# coding=utf-8
from app import db


class Despesa_dao(db.Model):
    __tablename__ = "despesa"
    id_despesa = db.Column(db.Integer, primary_key=True)
    nome = db.Column(db.String)
    valor = db.Column(db.Float)
    descricao = db.Column(db.String)
    tipo = db.Column(db.String)
    data = db.Column(db.Date)

    def __init__(self, valor, descricao, tipo, date, nome):
        self.valor = valor
        self.descricao = descricao
        self.tipo = tipo
        self.date = date
        self.nome = nome


    def salvar(self):
        db.session.add(self)
        db.session.commit()

    def listar(id):
        return Despesa_dao.query.get(id)

    @staticmethod
    def findAll():
        return Despesa_dao.query.all()

    def __repr__(self):
        return str({"nome": self.nome, "valor": self.valor, "descricao": self.descricao,"tipo": self.tipo, "data":self.data ,"nome":self.nome})