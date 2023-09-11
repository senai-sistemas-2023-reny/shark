package br.com.senai.shark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.shark.model.Cliente;
import br.com.senai.shark.repository.ClienteRepository;

@Service
public class ClienteService {
   
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadastraCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente>listarCliente(){
		return clienteRepository.findAll();
	}
	
}
