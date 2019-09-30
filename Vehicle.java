public abstract class Vehicle {

	//Attributs
	private String brand = new String();
	private int kilometers;

	//Constructeur
	public Vehicle(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}

	//Getters
	public String getBrand() {
		return this.brand;
	}

	public int getKilometers() {
		return this.kilometers;
	}

	//Setters
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	//Méthode abstraite
	public abstract String doStuff();
}