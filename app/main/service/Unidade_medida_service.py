# coding=utf-8
from app.main.models.Unidade_medida import Unidade_medida_dao


class Unidade_medida_service(object):
    def salvar(self, unidade):
        u = self.filter_nome(unidade.nome)
        if u == None:
            unidade.salvar()
            return {'mensagem': 'Unidade cadastrada com sucesso'}
        else:
            return {'mensagem': 'Nome de Unidade ja cadastrado'}

    def update(self, produto):
        print(produto.quantidade)
        Unidade_medida_dao.update(produto)

    def listar(self, id):
        return Unidade_medida_dao.listar(id)

    @staticmethod
    def findAll():
        return Unidade_medida_dao.findAll()

    @staticmethod
    def filter_nome(nome):
        return Unidade_medida_dao.filter_nome(nome)
