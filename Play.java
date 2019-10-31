import java.util.Scanner;
import java.util.Arrays;

public class Play{
	// First I determine the attributes needed.
	public static String name1;
	public static String autoplayer;

	// Main method.
	public static void main(String[]args){
		System.out.println("A Card Game by Christian, Mikkel and Rasmus");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name below:"); //Hvis man selv skal teste sit navn ind.
		name1 = keyboard.nextLine();
		
		Player player1=new Player(name1);
		Player player2=new Player(autoplayer);
		Board game=new Board(player1,player2);

		System.out.println(" ");
		System.out.println("The rules of the game are as follows:");
		System.out.println("1. At the start of the game each player starts with 3 cards.");
		System.out.println("2. The winner of the previous round begins the current round (with the exception of the first round where it is decided between the players).");
		System.out.println("3. Then a Trump Suit will be decided.");
		System.out.println("4. If the second player plays a card of higher value in the same suit as the first player, then he/she wins both cards.");
		System.out.println("5. If the second player plays a card of the Trump Suit and the first player does not, then the second player wins both cards.");
		System.out.println("6. Ohterwise, the first player wins the round.");
		
		System.out.println(" ");		
		System.out.println("To win the game:");
		System.out.println("1. When there are no more cards in the deck, the players continue until they run out of cards in their hands.");
		System.out.println("2. The scores are determined by the cards of value in their collected deck of cards they've won.");
		System.out.println("3. The cards of value are as follows; Ace, Seven, King, Jack and Queen. whose values are: 11, 10, 4, 3 and 2 respectively.");
		
		
		System.out.println(" ");
		System.out.println("Would you like to go first? (yes/no)");
		String decision;
		decision=keyboard.nextLine();
		boolean yesNo;
		switch(decision){
        case "yes":
            yesNo = false;
			System.out.println("The current cards in your hand: ");
			System.out.println(Arrays.toString(player1.hand()));
			System.out.println("The Trump Card of this round is "+game.trumpCard());
			System.out.println("What card would you like to play?");
			System.out.println(player1.removeFromHand());
			// ACTION
			
            break;
        case "no": 
            yesNo = true;
			System.out.println("The current cards in your hand: ");
			System.out.println(Arrays.toString(player1.hand()));
			System.out.println("The Trump Card of this round is "+game.trumpCard());
			// ACTION
			
            break;
        default: 
            System.out.println("please enter again ");
		}
		
		/*
		* The repeating rounds after the first round is playing.
		*/
		boolean playing=true;
		while(playing){
			System.out.println("The current cards in your hand: ");
			System.out.println(Arrays.toString(player1.hand()));
			break;
			
			
		}
	}	
}
	
-----------------------------------------------------------------------------------------------------------------------------------
    // Choose who goes first.
    public static void chooseFirstPlayer(){
        game.next(); 		// picks the player to go first
    }
	
	// Declare winner of duel.
	public static void duel(){
		// HER MANGLER VI NOGET TIL AT SIMULERE KORT vs. KORT.
		game.move(card1,card2); 		// only returns the winner of the duel
		
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


import java.util.Scanner;

public class Play{
	// First I determine the attributes needed.
	public static String name1;
	public static String autoplayer;

	// Main method.
	public static void main(String[]args){
		System.out.println("Testing...");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name player1"); //Hvis man selv skal teste sit navn ind.
		name1 = keyboard.nextLine();
		Player player1=new Player(name1);
		Player player2=new Player(autoplayer);
		Board game=new Board(player1,player2);
		
	}	
}
