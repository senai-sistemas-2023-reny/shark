package br.com.senai.shark.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.ClienteDto;
import br.com.senai.shark.model.Cliente;
import br.com.senai.shark.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	@PostMapping
	public ResponseEntity<ClienteDto> cadastraCliente(@RequestBody ClienteDto clienteDto){
		Cliente cliente = new Cliente(clienteDto);
		cliente = clienteService.cadastraCliente(cliente);
		return ResponseEntity.ok(new ClienteDto(cliente));
	}
	@GetMapping
	public ResponseEntity<List<ClienteDto>> listarCliente(){
		List<Cliente> listarCliente = clienteService.listarCliente();
		List<ClienteDto> listaClienteDto = listarCliente.stream().map(ClienteDto:: new ).toList();
		return ResponseEntity.ok(listaClienteDto);
	}
	
}
