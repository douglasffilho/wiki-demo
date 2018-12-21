package br.com.douglasffilho.wikidemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(final Map<String, Object> modelMap) {

		modelMap.put("message", "Bem vindo!");

		return "index";
	}

	@PostMapping("/calcula")
	public String calcula(String valor1, String valor2, Map<String, Object> modelMap) {
		final Integer v1 = Integer.parseInt(valor1);
		final Integer v2 = Integer.parseInt(valor2);
		final Integer v3 = v1 + v2;

		modelMap.put("valor1", valor1);
		modelMap.put("valor2", valor2);
		modelMap.put("valor3", v3);

		return "index";
	}

}
