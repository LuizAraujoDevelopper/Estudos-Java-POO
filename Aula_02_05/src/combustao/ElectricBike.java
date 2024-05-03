package combustao;

public class ElectricBike extends Bike implements Eletric {

	public ElectricBike(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, marca, modelo, numPassanger, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Bicicleta elétrica"+ super.getMarca() +" "+super.getModelo()+" movimentando");
	}

	@Override
	public void carregarBateria() {
		// TODO Auto-generated method stub

	}

}
