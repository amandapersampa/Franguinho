Feature: Cadastro de compras
O cliente vai cadastra as compras que foram feitas para o restaurante
    
Scenario: Compra cadastrada com sucesso
Given compra vai ser cadastrada com todas as informações
When  Eu quero cadastrar uma compra
Then  mensagem de sucesso 
  
Scenario: erro ao cadastrar a compra
Given compra vai ser cadastrada faltando informações
When  Eu quero cadastrar uma compra faltando informação
Then  mensagem de compra com infomações incompletas

