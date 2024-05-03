package combustao;

public class car extends Vehicle{
	private int numPassanger;private  float weight;
	public car(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, marca, modelo);
		this.numPassanger = numPassanger;
		this.weight = weight;
	}
	public float maxWeight() {
		return this.weight;
	}
	public int numberOfPassenger(){
		
		return this.numPassanger;
	}
	@Override
	 void drive() {
		System.out.println("Dirigindo o carro "+super.getMarca()+" "+super.getModelo()+ "que tem peso máximo "+ maxWeight() +"e número de Passageiro "+ numberOfPassenger());
		
	}
}
