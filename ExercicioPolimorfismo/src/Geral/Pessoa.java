package Geral;

public class Pessoa {
	private String CPF;
	private String nome;
	private int idade;
	
	public Pessoa() {
		
	}

	
	
	
	
	
	// GETTERS e SETTERS
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
