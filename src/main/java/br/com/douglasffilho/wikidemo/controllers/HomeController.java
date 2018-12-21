package br.com.douglasffilho.wikidemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

	@RequestMapping("/")
	public static String home(final Map<String, Object> modelMap) {

		modelMap.put("message", "Bem vindo!");

		return "index";
	}

}
