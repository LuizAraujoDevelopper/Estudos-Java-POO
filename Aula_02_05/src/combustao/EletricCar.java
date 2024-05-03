package combustao;

public class EletricCar extends car implements Eletric {

	public EletricCar(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, marca, modelo, numPassanger, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Carro elétrico" +super.getMarca() +" "+super.getModelo() + "movimentando");


	}

	@Override
	public void carregarBateria() {
		System.out.println("Carregando a bateria do carro " +super.getCor());
	}

}
