Feature: Cardapio

O cliente vai cadastrar o cardapio

	Scenario: Cardapio cadastrada com sucesso
		Given Cardapio ainda nao foi cadastrada
		When Eu quero cadastrar uma Cardapio 
		Then Mensagem de cardapio cadastrado com sucesso eh exibida
	
	Scenario: Erro ao cadastrar Cardapio
		Given Cardapio ainda nao foi cadastrado
		When Eu quero cadastrar uma Cardapio faltando os campos obrigatorios
		Then Mensagem de cardapio nao cadastrado, ocorreu um erro eh exibida		