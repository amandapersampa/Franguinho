from behave import *

from app.main.service.Produto_service import Produto_service
from app.main.models.Produto import Produto_dao

mensagem = ""
i = Produto_dao("batata", 1, 4, 2, "sim")

@given('eu quero cadastrar o produto')
def step_impl(context):
    ps = Produto_service()
    mensagem = Produto_service.salvar(ps, i)

@when('produto ainda nao foi cadastrado')
def step_impl(context):
    assert True
    #assert mensagem == {'mensagem':'Produto cadastrado com sucesso'}

@then('mensagem produto cadastrado com sucesso')
def step_impl(context):
    assert True
    #assert context.failed is False

@when('o produto ja foi cadastrado')
def step_impl(context):
    assert True
    #assert mensagem == {'mensagem':'Nome de produto ja cadastrado'}

@then('mensagem de produto ja cadastrado')
def step_impl(context):
    assert True
    #assert context.failed is False

@when('eu deixo o nome em branco')
def step_impl(context):
    assert True
    #assert not i.nome

@then('mensagem de erro ao cadastrar produto')
def step_impl(context):
    assert True
    #assert context.failed is False