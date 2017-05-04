Feature: ItemEstoque
  
  O cliente ira candastra o itemEstoque

  Scenario: cadastrar ItemEstoque com sucesso
    Given tenho o ItemEstoque que não foi cadastrado
    When Eu quero cadastrar ItemEstoque
    Then Mensagem de sucesso

  
