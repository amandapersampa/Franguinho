Feature: Cadastro de produto

Scenario: produto foi cadastrado com sucesso
    Given eu quero cadastrar o produto
    When  produto ainda nao foi cadastrado
    Then  mensagem produto cadastrado com sucesso

Scenario: produto ja cadastrado
    Given eu quero cadastrar o produto
    When  o produto ja foi cadastrado
    Then  mensagem de produto ja cadastrado

Scenario: erro ao cadastrar produto
    Given eu quero cadastrar o produto
    When  eu deixo o nome em branco
    Then  mensagem de erro ao cadastrar produto