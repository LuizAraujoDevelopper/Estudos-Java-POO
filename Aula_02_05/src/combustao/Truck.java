package combustao;

import java.util.Scanner;
public class Truck extends Vehicle implements Fuel {
	private int numPassanger;
	private float weight;
	public Truck(String cor, String marca, String modelo, int numPassanger, float weight) {
		super(cor, marca, modelo);
		this.numPassanger = numPassanger;
		this.weight = weight;
	}

	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public int getNumPassanger() {
		return numPassanger;
	}

	public void setNumPassanger(int numPassanger) {
		this.numPassanger = numPassanger;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Caminhão "+super.getMarca()+" "+super.getModelo() +" movimentando");
	}

	@Override
	public int numberOfPassenger() {
		// TODO Auto-generated method stub
		return this.numPassanger;
	}

	@Override
	public float maxWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void abastecer() {
		// TODO Auto-generated method stub
		System.out.println("Abastecendo o caminhão "+super.getMarca()+" "+super.getModelo() );
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
System.out.println("Dirigindo o caminhão" + super.getMarca()+" "+super.getModelo()+" "+super.getCor()+"  peso máximo "+maxWeight());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		Scanner sc = new Scanner(System.in);
		Bike bike1 = new Bike(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
		ElectricBike eleBike1 = new ElectricBike(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
		EletricCar eleCar1 = new EletricCar(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
		Truck truck1 = new Truck(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextFloat());
		bike1.drive();         
		eleBike1.start();
		eleBike1.carregarBateria();
		eleCar1.start();
		eleCar1.carregarBateria();
		truck1.abastecer();
		truck1.drive();
		sc.close();
	
		
	}

}
