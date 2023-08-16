package br.com.senai.shark.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.service.HelloService;


@RestController
public class HelloControler {
    @Autowired
	private HelloService helloService;
	
	
	
	@GetMapping("/Ola")	
	public String olaMundo(@RequestParam(defaultValue =" mundo") String nome, @RequestParam(defaultValue = "30")Integer idade) {
		helloService.validadeIdade(idade);
		return "Ola" + nome + ", idade " + idade;
		
	}
	
	@GetMapping("/ola/{nome}")
	public String OlaMundoNome(@PathVariable String nome) {
		return "Ola" + nome;
	}
	
	
	
	
}


