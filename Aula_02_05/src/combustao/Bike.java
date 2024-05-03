package combustao;

abstract class Bike extends Vehicle{
	private int numPassanger;
	private float weight;
	
	
	public Bike(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, marca, modelo);
		this.numPassanger = numPassanger;
		this.weight = weight;
	}

	@Override
	public int numberOfPassenger() {
		
		return this.numPassanger;
	}

	@Override
	public float maxWeight() {
		return this.weight;
	}

	@Override
	void drive() {
		System.out.println("Guiando a bicicleta" +super.getMarca()+super.getModelo()+ super.getCor()+"  peso máximo" +maxWeight());
		
	}
}