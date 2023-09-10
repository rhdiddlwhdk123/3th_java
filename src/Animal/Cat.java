package Animal;

public class Cat extends Animal{
	
	public Cat(String name, int weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public void speack() {
		System.out.println("야옹");
	}
}
