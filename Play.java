import java.util.Scanner;
import java.util.Arrays;

/*
* 
*/
public class Play{
	// First I determine the attributes needed.
	public static String name1;
	public static String autoplayer;
	public static String removeFromHand;

	// Main method.
	public static void main(String[]args){
		System.out.println("A Card Game by Christian, Mikkel and Rasmus");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name below:");
		name1 = keyboard.nextLine();
		
		Player player1=new Player(name1);
		Player opponent=new Player(autoplayer);
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
		//oversættelse til dansk.
		System.out.println(" ");
		System.out.println("Reglerne for spillet er som følgende:");
		System.out.println("1. I starten af spillet vil hver spiller få 3 kort");
		System.out.println("2. Vinderen af den tidligere runde begynder");
		System.out.println("3. En trumf-type vil derefter blive valgt gennem et kort(f.eks Hjerte konge, trumf-type=Hjerte)");
		System.out.println("4. Hvis spiller 2 bruger et kort, som har højere værdi og samme type som spiller 1's kort, så vinder spiller 2 runden");
		System.out.println("5. Hvis spiller 2 bruger et kort af trumf-typen, og første spiller ikke gjorde, så vinder spiller 2 runden");
		System.out.println("6. I alle andre tilfælde, så vil spiller 1 vinde runden");
		
		System.out.println(" ");		
		System.out.println("For at vinde gælder følgende);
		System.out.println("1. Når der ikke er flere kort tilbage i kortdækket, så fortsætter spillerne, indtil at de ikke har flere kort tilbage");
		System.out.println("2. Spillernes score er bestemt udfra kortenes værdi i deres bunke med vundne kort");
		System.out.println("3. Kortenes værdi er som følgende: Es, Syver, Konge, Knægt og Dronning. Deres værdier er henholdsvis: 11, 10, 4, 3 and 2.");
			
			
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
				card1=keyboard.nextLine();
				player.removeFromHand(card1);	
				autoPlayer.next(card1);
				game.move(card1, card2);
				System.out.println("The winner of this round is "+game.next());
				while (game.next()=name1){
					player.addToCollectedCards(card1, card2)
				}
				player.addToHand(card);
				game.next();
				// ACTION
				break;
			case "no": 
				yesNo = true;
				System.out.println("The current cards in your hand: ");
				System.out.println(Arrays.toString(player1.hand()));
				System.out.println("The Trump Card of this round is "+game.trumpCard());
				System.out.println("Your opponent will start then");
				autoPlayer.next();
				card2=keyboard.nextLine();
				player.removeFromHand(card2);
				game.move(card1, card2);
				System.out.println("The winner of this round is "+game.next());
				while (game.next()=name1){
					player.addToCollectedCards(card1, card2)
				}
				player.addToHand(card);
				game.next();
				// ACTION
				break;
			default: 
				System.out.println("We take that as yes ");
				System.out.println("The current cards in your hand: ");
				System.out.println(Arrays.toString(player1.hand()));
				System.out.println("The Trump Card of this round is "+game.trumpCard());
				System.out.println("What card would you like to play?");
				card1=keyboard.nextLine();
				player.removeFromHand(card1);	
				autoPlayer.next(card1);
				game.move(card1, card2);
				System.out.println("The winner of this round is "+game.next());
				while (game.next()=name1){
					player.addToCollectedCards(card1, card2)
				}
				player.addToHand(card);
				game.next();
				break;
		}
		
		/*
		* The repeating rounds after the first round is playing.
		*/
		boolean game.gameOver = false;
		while (!game.gameOver()){
			System.out.println("it is "+game.next()"'s turn")
			if(game.next()=opponent)
				autoPlayer.next();
				card2=keyboard.nextLine();
				player.removeFromHand(card2);
				game.move(card1, card2);
				System.out.println("The winner of this round is "+game.next());
				while (game.next()=name1){
					player.addToCollectedCards(card1, card2)
				}
				player.addToHand(card);
				game.next();
			else if (game.next()=name1)
				card1=keyboard.nextLine();
				player.removeFromHand(card1);	
				autoPlayer.next(card1);
				game.move(card1, card2);
				System.out.println("The winner of this round is "+game.next());
				while (game.next()=name1){
					player.addToCollectedCards(card1, card2)
				}
				player.addToHand(card);
				game.next();
			else
				game.gameOver()=true;
		}
	}

	/*
	* Declares winner by counting the final amount of points of the player.
	*/ 
	public static void declareWinner(){
		int totalPoints=card.points(player1.collectedCards());
		if(totalPoints>60)
			System.out.print("Congratz on winning "+name1+", with "+totalPoints+" points.");
		else if(totalPoints==60)
			System.out.print("Well, this is rare, it's a tie!");
		else
			System.out.print("Better luck next time, "+name1+", you just needed "+(61-totalPoints)+" points more.");
		System.out.println("GAME OVER");
}
