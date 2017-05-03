package br.edu.ifes.serra.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { CardapioControllerTest.class })
public class CardapioControllerTest {

//	private MockMvc mockMvc;	
//
//	MockHttpSession session;
//
//	MockHttpServletRequest request;
//
//	@Before
//	public void setup() {
//		this.mockMvc = MockMvcBuilders.standaloneSetup(CardapioController.class).build();
//	}
	@Test
	public void test(){
		
	}
//
//	@Test
//	public void validate_get_address() throws Exception {
//
//		mockMvc.perform(get("/cardapio").session(session)
//		        .accept(MediaType.APPLICATION_JSON))
//		        .andExpect(status().isOk())
//		        .andExpect(view().name("test"));
//
//	}

}
