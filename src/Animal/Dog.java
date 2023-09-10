package Animal;

import java.util.Scanner;

public class Dog extends Animal {
	
	Scanner scanner = new Scanner(System.in);
	
	public Dog(String name, int weight, String color) {
		super(name, weight, color);
	}
	
	@Override
	public void speack() {
		System.out.println("멍멍");
	}
	
}
