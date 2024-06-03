package Geral;

public class ClienteEspecial extends Cliente {
	private float DescontosFixo;
	public ClienteEspecial() {
		
	}
	public float getDescontosFixo() {
		return DescontosFixo;
	}
	public void setDescontosFixo(float descontosFixo, float valorTotal) {
		DescontosFixo = descontosFixo * valorTotal;
	}

}
