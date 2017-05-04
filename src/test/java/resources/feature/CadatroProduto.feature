Feature: Cadastro de produto

O cliente vai cadatrar o produto 
    
Scenario: produto foi cadastrado com sucesso
    Given produto ainda nao foi cadastrado
    When  Eu quero cadastrar o produto 
    Then  mensagem produto cadastrado com sucesso
  
Scenario: produto já cadastrado
    Given produto já foi cadastrado
    When  Eu quero cadastrar o produto existente
    Then  mensagem de produto já cadastrado

Scenario: produto não foi cadastrado
    Given produto ainda nao foi cadastrado
    When  Eu quero cadastrar o produto sem nome
    Then  mensegem de erro no preenchimento do produto