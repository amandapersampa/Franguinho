package br.edu.ifes.serra.controller;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest(CardapioController.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CardapioControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new CardapioController()).build();
	}

	@Test
	public void validaConexao() throws Exception {
		String content = "{\"cardCod\":1,\"itemCod\":null}";
		MvcResult result = mockMvc.perform(get("/cardapio").accept(MediaType.APPLICATION_JSON)).andReturn();
		String response = result.getResponse().getContentAsString();
		assertTrue(response.equals(content));
	}

}
