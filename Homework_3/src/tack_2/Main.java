package tack_2;

public class Main {
	public static void main(String[] args) {
		
		Animal animal = new Animal("Леопард", "20 км/год", "7 років");
		System.out.println(animal);
		
		animal.changeData("Бик", "2 км/год", "14 років");
		System.out.println(animal);
	}
}
