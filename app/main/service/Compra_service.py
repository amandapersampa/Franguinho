# coding=utf-8
from app.main.models.Compra import Compra_dao
from app import Produto_dao


class Compra_service(object):
    def salvar(self, compra):
        produto = Produto_dao.findById(compra.id_produto)
        if produto != None:
            produto.quantidade += compra.quantidade
            compra.salvar()
            return {'mensagem': 'Compra cadastrado com sucesso'}
        else:
            return {'mensagem': 'Produto da compra nao existe'}
        
    def listar(self, id):
        return Compra_dao.listar(id)

    @staticmethod
    def findAll():
        return Compra_dao.findAll()

