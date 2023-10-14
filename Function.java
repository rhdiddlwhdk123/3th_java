package dice;
import java.util.List;

public class Function {
	public static Player winner(List<Player> players) {
        
		Player winner = null;
        int maxScore = 0;

        for (Player player : players) {
        	int score = player.dice();
            
        	if (score > maxScore) {
                maxScore = score;
                winner = player;
            } 
        	
        	else if (score == maxScore) {
            	if (player.dice() > winner.dice()) {
                    winner = player;
                }
            }
        }

        return winner;
    }
}