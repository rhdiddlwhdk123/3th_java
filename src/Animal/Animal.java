package Animal;

public class Animal {
	String name;
	int weight;
	String color;
	
	public Animal(String name, int weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public void speack() {
		
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getWeight() { return weight; }
	public void setWeight(int weight) { this.weight = weight; }
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
}
