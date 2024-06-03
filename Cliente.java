package Geral;

public class Cliente extends Pessoa {

	
	public Cliente() {
		
	}
	
	
	
	//GETTERS e SETTERS
	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	private String Endereco;
	private int Telefone;
	
}
