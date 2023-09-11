package br.com.senai.shark.controler;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.shark.dto.HabitanteDto;


@RestController
public class HabitanteController {

	private static List<HabitanteDto>habitantes =  new ArrayList<>();
	
	@PostMapping("/habitante")
	public ResponseEntity<HabitanteDto> recebeDados(@RequestBody HabitanteDto habitanteDto) {
		habitantes.add(habitanteDto);
		return ResponseEntity.ok(habitanteDto);
		
		//return habitanteDto;
	
		
	
	
	}
	@GetMapping("/habitante")
	public ResponseEntity<List<HabitanteDto>> recebeDado(@RequestParam Double salario, @RequestParam Integer numeroFilhos){
		List<HabitanteDto>habitanteD = new ArrayList<>();
		for (HabitanteDto habitanteDto : habitantes) {
			if (salario< habitanteDto.getSalario()|| numeroFilhos<habitanteDto.getNumeroFilhos()) {
				habitanteD.add(habitanteDto);
			}
		}
		return ResponseEntity.ok(habitanteD);
		
	}
}
