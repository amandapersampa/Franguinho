package br.edu.ifes.serra.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifes.serra.model.Greeting;
import br.edu.ifes.serra.utils.builders.RequestResponseBuilder;

@RestController
@RequestMapping("/")
public class HomeController {

	private static final String TEMPLATE = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/")
	@GetMapping("/greeting-javaconfig")
	public ResponseEntity<Greeting> greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return RequestResponseBuilder.buildResponse(new Greeting(counter.incrementAndGet(),
				String.format(TEMPLATE, name)));
	}
}
