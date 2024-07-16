package br.com.lcrippa.model;

import java.util.Objects;

public class Jogadores {

	private Long id;
	private String nome;
	private String  sobrenome;
	private String CPF;
	private String dt_nascimento;
	private String posicao;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, dt_nascimento, nome, posicao, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogadores other = (Jogadores) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(dt_nascimento, other.dt_nascimento)
				&& Objects.equals(nome, other.nome) && Objects.equals(posicao, other.posicao)
				&& Objects.equals(sobrenome, other.sobrenome);
	}
	
	
	
	
	
	
}
