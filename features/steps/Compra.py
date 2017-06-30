from behave import *
from app.main.service.Compra_service import Compra_service
from app.main.dao.Compra_dao import Compra_dao

mensagem = ""
i = Compra_dao(50, 20.0, "12/06/2017", 1)

@given('eu quero cadastrar uma compra')
def step_impl(context):
    mensagem = Compra_service.salvar(context, i)

@when('compra ainda nao foi cadastrada')
def step_impl(context):
    assert mensagem == {'mensagem': 'Compra cadastrado com sucesso'}

@then('mensagem compra cadastrada com sucesso')
def step_impl(context):
    assert context.failed is False

@when('eu deixo a quantidade em branco')
def step_impl(context):
    assert not i.quantidade

@then('mensagem de erro ao cadastrar compra')
def step_impl(context):
    assert context.failed is False