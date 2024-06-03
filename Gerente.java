package Geral;

public class Gerente extends Funcionario {
	private int[] Funcionario = new int[100];
	float BonusAnual;
	
	public Gerente() {
	
	}


	
	
	
	//GETTERS e SETTERS
	public int[] getFuncionario() {
		return Funcionario;
	}


	public void setFuncionario(int[] funcionario) {
		Funcionario = funcionario;
	}

}
