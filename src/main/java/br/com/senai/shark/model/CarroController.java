package br.com.senai.shark.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/carro")
public class CarroController {

	
	private static List<CarroDto> carros = new ArrayList<>();
	
	@Autowired
	private CarroService carroService;
	@PostMapping
	public ResponseEntity<CarroDto> cadastroCarro(@RequestBody CarroDto carroDto){
		Carro carro = carroService.inserirCarro(carroDto);
		return ResponseEntity.ok(new CarroDto(carro));
		
	}
	public ResponseEntity<List<CarroDto>> listarCarros(){
		List<Carro> carros = carroService.listarCarro();
		List<CarroDto> carrosDto = carros.stream().map(CarroDto:: new).toList();
		for ( Carro carro: carros) {
			carrosDto.add(new CarroDto(carro));
		}
		return ResponseEntity.ok(carrosDto);
	}
	
	public ResponseEntity<Void> excluirCarro(@PathVariable Integer id){
		carroService.excluirCarro(id);
		return ResponseEntity.status(HttpStatus.OK).build()
;	}
}
