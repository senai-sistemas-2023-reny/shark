package br.com.senai.shark.dto;

public class HabitanteDto {

	private String nome;
	private String cidade;
	private Double salario;
	private Integer numeroFilhos;
	
	
	
	public HabitanteDto() {
		super();
	}
	public HabitanteDto(String nome, String cidade, Double salario, Integer numeroFilhos) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.salario = salario;
		this.numeroFilhos = numeroFilhos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer getNumeroFilhos() {
		return numeroFilhos;
	}
	public void setNumeroFilhos(Integer numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}
	
	
	
}
