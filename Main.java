package dice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Player> players = new ArrayList();
		
		String name;
		
		System.out.print("1번째 플레이어의 이름을 입력하세요: ");
        name = scanner.nextLine();
        Player player1 = new Player(name);
        players.add(player1);
        
        System.out.print("2번째 플레이어의 이름을 입력하세요: ");
        name = scanner.nextLine();
        Player player2 = new Player(name);
        players.add(player2);
        
        for (Player player : players) {
            Dice dice = new Dice();
            player.roll(dice);
            System.out.println(player.name() + "의 결과: " + player.dice());    
        }
        
        Player winner = Function.winner(players);
        
        if (winner == null) {
            System.out.println("무승부");
        } else {
            System.out.println("승자: " + winner.name());
        }
    }
}