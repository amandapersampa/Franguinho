package br.edu.ifes.serra.steps;

import br.edu.ifes.serra.model.entity.Cardapio;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CadastroCardapioStep {
	Cardapio cardapio;
	String msg;

	@Given("^Cardapio ainda nao foi cadastrada$")
	public void cardapio_ainda_nao_foi_cadastrada() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^Eu quero cadastrar uma Cardapio$")
	public void eu_quero_cadastrar_uma_Cardapio() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^Mensagem de cardapio cadastrado com sucesso eh exibida$")
	public void mensagem_de_cardapio_cadastrado_com_sucesso_eh_exibida() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Given("^Cardapio ainda nao foi cadastrado$")
	public void cardapio_ainda_nao_foi_cadastrado() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@When("^Eu quero cadastrar uma Cardapio faltando os campos obrigatorios$")
	public void eu_quero_cadastrar_uma_Cardapio_faltando_os_campos_obrigatorios() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Then("^Mensagem de cardapio nao cadastrado, ocorreu um erro eh exibida$")
	public void mensagem_de_cardapio_nao_cadastrado_ocorreu_um_erro_eh_exibida() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}
}
