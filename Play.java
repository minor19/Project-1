import java.util.Scanner;

public class Play{
	// First I determine the attributes needed.
	public String name1
	Scanner Keyboard = new Scanner(System.in);
	System.out.Println("Enter your name player1"); //Hvis man selv skal teste sit navn ind.
	name1 = keyboard.nextLine();
	private static Player player1=new Player(name1);
	private static Player player2=new Player("Anita");
	private static Board game=new Board(player1,player2);
	
	
	// Main method.
	public static void main(String[]args){
		game.trumpcard(); // Shows Trump-card
		System.out.println("The Trump Card is"+trumpcard)
		
		player.hand(); //returns a copy of the cards in the player's hand
		System.out.println(player1+"your hand is" + hand)
			
		if (card==hand){
		player.removeFromHand(Card card)
		}
		
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
/* rækkefølge for Class Player methods:
 * 1. name
 * 2. hand
 * 3. removeFromHand
 * 4. cardsInHand
 * 5. addToHand
 * 6. collectedCards
 * 7. addToCollectedCards
 */
