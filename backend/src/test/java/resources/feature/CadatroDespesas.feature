Feature: Despesas

O cliente vai cadastrar as despesas

	Scenario: Despesa variavel cadastrada com sucesso
		Given Despesa variavel ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Mensagem de sucesso
	
	Scenario: Erro ao cadastrar despesa variavel
		Given Despesa variavel ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Mensagem de erro
	
	Scenario: Despesa variavel ja cadastrada
		Given Despesa variavel ja foi cadastrada
		When Eu quero cadastrar uma despesa variavel
		Then Mensagem de despesa variavel ja cadastrada
		
		
	Scenario: Despesa fixa cadastrada com sucesso
		Given Despesa fixa ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Mensagem de sucesso
	
	Scenario: Erro ao cadastrar despesa fixa
		Given Despesa fixa ainda nao foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Mensagem de erro
	
	Scenario: Despesa fixa ja cadastrada
		Given Despesa fixa ja foi cadastrada
		When Eu quero cadastrar uma despesa fixa
		Then Mensagem de despesa fixa ja cadastrada