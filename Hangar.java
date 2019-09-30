public class Hangar {


	public static void main(String[] args) {

		Boat nautilus = new Boat("Nautilus", 450);
		Car peugeot = new Car("Peugeot 206", 315_000);

		System.out.println(nautilus.doStuff());
		System.out.println(peugeot.doStuff());
	}

}