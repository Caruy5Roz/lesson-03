package tack_2;

public class Main {
	public static void main(String[] args) {
		
		Animal animal = new Animal("�������", "20 ��/���", "7 ����");
		System.out.println(animal);
		
		animal.changeData("���", "2 ��/���", "14 ����");
		System.out.println(animal);
	}
}
