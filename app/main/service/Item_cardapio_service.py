from app.main.models.Item_cardapio import Item_cardapio_dao

class Item_cardapio_service(object):
    def salvar(self, item):
        print(item)
        item_cardapio = Item_cardapio_dao.filter_nome(item.nome)
        if item_cardapio == None:
            item.salvar()
            return {'mensagem': 'item cardapio cadastrado com sucesso'}
        else:
            return {'mensagem': 'nome  de item já existe'}

    def listar(self, id):
        return Item_cardapio_dao.listar(id)

    @staticmethod
    def findAll():
        return Item_cardapio_dao.findAll()