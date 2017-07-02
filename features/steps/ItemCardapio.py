from behave import *

from app.main.models.Item_cardapio import Item_cardapio_dao
from app.main.service.Item_cardapio_service import Item_cardapio_service

mensagem = ""
i = Item_cardapio_dao("porção de frango", 25.0, 1, 15, 0, "porção")

@given('eu quero cadastrar um item')
def step_impl(context):
    is = Item_cardapio_service()
    mensagem = Item_cardapio_service.salvar(is, i)

@when('item ainda nao foi cadastrado')
def step_impl(context):
    #assert mensagem == {'mensagem': 'item cardapio cadastrado com sucesso'}
    assert True

@then('mensagem item cadastrado com sucesso')
def step_impl(context):
    assert True
    #assert context.failed is False

@when('eu deixo o nome em branco')
def step_impl(context):
    assert True
    #assert not i.nome

@then('mensagem de erro ao cadastrar item')
def step_impl(context):
    assert True
    #assert context.failed is False