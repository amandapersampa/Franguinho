Feature: Cadastro de produto

  Scenario: cadastrar um produto com sucesso
      Given cadastrar um produto que nao foi cadastrado
      When  cadastsrar um produto
      Then  retornar mensagem sucesso

