package Animal;

public class Chicken extends Animal {

	public Chicken(String name, int weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public void speack() {
		System.out.println("꼬끼오");
	}
}
