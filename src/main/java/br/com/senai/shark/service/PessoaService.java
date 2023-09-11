package br.com.senai.shark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.model.Pessoa;
import br.com.senai.shark.repository.PessoaRepository;
@Service
public class PessoaService {
    @Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa inserePessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
		
	}
	
}
