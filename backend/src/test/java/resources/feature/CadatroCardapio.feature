Feature: Cardapio

O cliente vai cadastrar o cardapio

	Scenario: Cardapio Principal cadastrada com sucesso
		Given Cardapio Principal ainda nao foi cadastrada
		When Eu quero cadastrar uma Cardapio Principal
		Then Mensagem de sucesso
	
	Scenario: Erro ao cadastrar Cardapio Principal
		Given Cardapio Principal ainda nao foi cadastrado
		When Eu quero cadastrar uma Cardapio Principal faltando os campos obrigatorios
		Then Mensagem de erro		
		
	Scenario: Cardapio extra cadastrada com sucesso
		Given Cardapio extra ainda nao foi cadastrado
		When Eu quero cadastrar uma Cardapio extra
		Then Mensagem de sucesso
	
	Scenario: Erro ao cadastrar Cardapio extra
		Given Cardapio extra ainda nao foi cadastrado
		When Eu quero cadastrar uma Cardapio extra faltando campos obrigatorios
		Then Mensagem de erro