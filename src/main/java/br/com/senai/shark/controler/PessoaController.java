package br.com.senai.shark.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Listener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.PessoaDto;
import br.com.senai.shark.model.Pessoa;
import br.com.senai.shark.service.PessoaService;



@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	private static List<PessoaDto> pessoas = new ArrayList<>();
			
	@Autowired
	private PessoaService pessoaService;
	@PostMapping
	public ResponseEntity<PessoaDto> criaPessoa(@RequestBody PessoaDto pessoaDto){
		Pessoa pessoa = new Pessoa(pessoaDto);
		pessoa = pessoaService.inserePessoa(pessoa);
		return ResponseEntity.ok(new PessoaDto(pessoa));
		
		
	}
	 
	
}
