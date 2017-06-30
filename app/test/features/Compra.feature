Feature: Cadastro de compra

Scenario: compra foi cadastrado com sucesso
    Given eu quero cadastrar uma compra
    When  compra ainda nao foi cadastrada
    Then  mensagem compra cadastrada com sucesso

Scenario: erro ao cadastrar compra
    Given eu quero cadastrar uma compra
    When  eu deixo a quantidade em branco
    Then  mensagem de erro ao cadastrar compra