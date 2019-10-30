import java.util.Scanner;

public class Play{
	// First I determine the attributes needed.
	private static Player player1=new Player("Jayce");
	private static Player player2=new Player("Anita");
	private static Board game=new Board(player1,player2);
	
	
	// Main method.
	public static void main(String[]args){
		game.trumpcard();
		System.out.println("Testing...");
		System.out.println();
		
		// MÅSKE INDFØR ET INTERFACE MED INTRO TIL SPIL OG FORKLARING AF SPILLET.
		
		while(!game.gameOver){
			// LOOP DUEL
		}
		
		chooseFirstPlayer(); // Choose who goes first
        declareWinner(); // Declare a winner
		wonLast(); // Determines who won last
	}

    // Choose who goes first.
    public static void chooseFirstPlayer(){
        game.next(); 		// picks the player to go first
    }
	
	// Declare winner of duel.
	public static void duel(){
		// HER MANGLER VI NOGET TIL AT SIMULERE KORT vs. KORT.
		game.move(); 		// only returns the winner of the duel
	}
	
	// Keeps track of points.
	public static void pointCount(){
	// HER MANGLER VI NOGET TIL AT HOLDE STYR PÅ POINT FRA DUEL
	}
	
	// Declare winner.
	public static void declareWinner(){
		if(player1.pointCount>60)
			System.out.print("Congratz on winning Jayce, with "+pointCount+" points.");
		else if(player1.pointCount==60)
			System.out.print("Well, this is rare, it's a tie.");
		else
			System.out.print("Better luck next time, Jayce, you just needed "+(61-pointCount)+" points more.");
		game.gameOver();		// checks if the game has ended
	}
}
