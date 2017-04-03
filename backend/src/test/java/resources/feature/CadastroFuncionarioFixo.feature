Feature: Cadastrar funcionario fixo

  Scenario: Abrir tela de Cadastrar funcionario
	Given Eu tenho um novo funcionario
	When Eu seleciono a opcao de adicionar novo funcionario
	Then A janela para inserir os dados do novo funcionario e aberta
    
  Scenario: Inserir dados do funcionario com sucesso
	Given Eu tenho um novo funcionario
   	And a janela para cadastrar esta aberta
	When Eu insiro os dados do funcionario
   	And Clico no botao para salvar
	Then Uma mensagem de sucesso eh exibida

  Scenario: Inserir dados errados do funcionario
	Given Eu tenho um novo funcionario
   	And a janela para cadastrar esta aberta
	When Eu insiro os dados do funcionario
  	And Clico no botao para salvar
	Then Uma mensagem de erro de informacoes eh exibida
    
  Scenario: Erro ao inserir dados do funcionario pois ja foi cadastrado
	Given Eu tenho um novo funcionario
    	And a janela para cadastrar esta aberta
	When Eu insiro os dados do funcionario
    	And Clico no botao para salvar
	Then Uma mensagem de ja cadastrado eh exibida
