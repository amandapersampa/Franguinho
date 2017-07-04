# coding=utf-8
from app.main.models.Despesa import Despesa_dao
from app import Produto_dao


class Despesa_service(object):
    def salvar(self, despesa):
        despesa.salvar()
        return {'mensagem': 'Compra cadastrado com sucesso'}

    def listar(self, id):
        return Despesa_dao.listar(id)

    @staticmethod
    def findAll():
        return Despesa_dao.findAll()

