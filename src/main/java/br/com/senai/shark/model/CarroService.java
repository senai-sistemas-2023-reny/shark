package br.com.senai.shark.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
    @Autowired
	private CarroRepository carroRepository;
	
	public Carro inserirCarro(CarroDto carroDto) {
		Carro carro = new Carro(carroDto);
		return carroRepository.save(carro);
	}
	
	public List<Carro> listarCarro(){
		return carroRepository.findAll();
		
	}
	public void excluirCarro(Integer id) {
		carroRepository.deleteById(id);
	}
}
