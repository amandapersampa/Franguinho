Feature: Cadastro de item do cardapio

Scenario: item foi cadastrado com sucesso
    Given eu quero cadastrar um item do cardapio
    When  item ainda nao foi cadastrado
    Then  mensagem item cadastrado com sucesso

Scenario: erro ao cadastrar item
    Given eu quero cadastrar um item do cardapio
    When  eu deixo o nome em branco
    Then  mensagem de erro ao cadastrar item