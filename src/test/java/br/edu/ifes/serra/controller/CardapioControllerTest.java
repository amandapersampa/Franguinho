package br.edu.ifes.serra.controller;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest(CardapioController.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CardapioControllerTest {

	private final String BASE = "cardapio";
	
	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new CardapioController()).build();
	}

	@Test
	public void validaConexao() throws Exception {
		String content = "{\"idCardapio\":1,\"itemCod\":0}";
		MvcResult result = mockMvc.perform(get("/cardapio").accept(MediaType.APPLICATION_JSON)).andReturn();
		String response = result.getResponse().getContentAsString();
		assertTrue(response.equals(content));
	}
	
	@Test
	public void list() throws Exception {
		String content = "[]";
		MvcResult result = mockMvc.perform(post("/cardapio/list")).andReturn();
		String response = result.getResponse().getContentAsString();
		assertTrue(response.equals(content));
	}

//	private void findByIdNotExistant(String rota) throws Exception {
//		mockMvc.perform(get(BASE + rota) //
//				.headers(getHeaders()) //
//				.accept(MediaType.APPLICATION_JSON)) //
//				.andDo(print()) //
//				.andExpect(status().isInternalServerError()) //
//				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8)) //
//				.andExpect(header().string(HttpHeaders.CACHE_CONTROL, API_CACHE)) //
//				.andExpect(jsonPath("$.type", is("RECORDNOTFOUND"))) //
//				.andExpect(jsonPath("$.length()", is(1))) //
//		;
//	}
//
//	@Test
//	@Rollback
//	public void updateItensOrdFat() throws Exception {
//		String rota = "/ImpItensOrdFat/1/2474/1/6428422/0/2/39111020/1";
//		// Get
//		ResultActions resultActions = mockMvc
//				.perform(get(BASE + rota) //
//						.headers(getHeaders()) //
//						.accept(APPLICATION_JSON)) //
//				.andDo(print()) //
//				.andExpect(status().isOk()) //
//				.andExpect(content().contentType(APPLICATION_JSON_UTF8)) //
//				.andExpect(header().string(CACHE_CONTROL, API_CACHE)) //
//				.andExpect(jsonPath("odfCod", is(1)));
//
//		// Change
////		ImpItensOrdFat itenOrdFat = CnxFunctions
////				.castJsonToObject(resultActions.andReturn().getResponse().getContentAsString(), ImpItensOrdFat.class);
////		itenOrdFat.setOdiPreQuant(new BigDecimal("20"));
////		itenOrdFat.setOdiPreValornf(BigDecimal.valueOf(12L));
////		itenOrdFat.setIdiEspDescrCompl(null);
//
//		// Get again
//		mockMvc.perform(get(BASE + rota) //
//				.headers(getHeaders()) //
//				.accept(APPLICATION_JSON)) //
//				.andDo(print()) //
//				.andExpect(status().isOk()) //
//				.andExpect(content().contentType(APPLICATION_JSON_UTF8)) //
//				.andExpect(header().string(CACHE_CONTROL, API_CACHE)) //
//				.andExpect(jsonPath("odfCod", is(1))) //
//				.andExpect(jsonPath("odiPreValornf", is(12)));
//	}

}
