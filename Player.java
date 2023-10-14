package dice;

public class Player {
	String name;
	int total;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public void roll(Dice dice) {
        total = dice.roll();
    }

    public int dice() {
        return total;
    }
}
