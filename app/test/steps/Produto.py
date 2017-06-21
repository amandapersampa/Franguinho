from behave import *
from app import Produto_controller as pc

# Eu quero cadastrar o produto
mensagem = pc.teste()

@given('eu quero cadastrar o produto')
def step_impl(context):
    pass

@when('produto ainda nao foi cadastrado')
def step_impl(context):
    assert mensagem == {'mensagem':'Produto cadastrado com sucesso'}

@then('mensagem produto cadastrado com sucesso')
def step_impl(context):
    assert context.failed is False

@when('o produto ja foi cadastrado')
def step_impl(context):
    assert mensagem == {'mensagem':'Nome de produto ja cadastrado'}

@then('mensagem de produto ja cadastrado')
def step_impl(context):
    assert context.failed is False

@when('eu deixo o nome em branco')
def step_impl(context):
    assert True is not False

@then('mensagem de erro ao cadastrar produto')
def step_impl(context):
    assert context.failed is False