package tack_2;

public class Animal {

	private String name;
	private String speed;
	private String age;
	
	
	public Animal(String name, String speed, String age) {
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", speed=" + speed + ", age=" + age + "]";
	}
	
	public void changeData (String name, String speed, String age) {
		this.name = name;
		this.speed = speed;
		this.age = age;
	}
	
}
