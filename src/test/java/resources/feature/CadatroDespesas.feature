Feature: Despesas
O cliente vai cadastrar as despesas

	Scenario: Despesa variavel cadastrada com sucesso
		Given Despesa variavel ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Despesa cadastrada com sucesso
	
	Scenario: Erro ao cadastrar despesa variavel
		Given Despesa variavel ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Mensagem de erro ao cadastrar despesa variavel
	
	Scenario: Despesa variavel ja cadastrada
		Given Despesa variavel ja foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Mensagem de despesa variavel ja cadastrada
		
		
	Scenario: Despesa fixa cadastrada com sucesso
		Given Despesa fixa ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Despesa fixa cadastrada com sucesso
	
	Scenario: Erro ao cadastrar despesa fixa
		Given Despesa fixa ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Mensagem de fixa nao cadastrada, ocorreu um erro
	
	Scenario: Despesa fixa ja cadastrada
		Given Despesa fixa ja foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Mensagem de despesa fixa ja cadastrada
