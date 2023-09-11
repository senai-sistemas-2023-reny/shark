package br.com.senai.shark.dto;

import br.com.senai.shark.model.Pessoa;

public class PessoaDto {
    private Integer id;
	private String nome;
	private String cpf;
	private String profissao;
	private Integer idade;
	private String genero;
	
	
	
	
	public PessoaDto(Integer id, String nome, String cpf, String profissao, Integer idade, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.idade = idade;
		this.genero = genero;
	}
	public PessoaDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PessoaDto(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.cpf = pessoa.getCpf();
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
}