import java.util.Scanner;
import java.util.Arrays;

public class Play{
	// Først vælger vi at initialisere variablene fra de givne classes.
	public static Scanner scanner;
	public static Board board;
	public static Player player;
	public static AutoPlayer autoPlayer;
	
	/* 
	 * Main metoden, hvor spillet bliver sat selve spillet kører.
	 */
	public static void main(String[] args){
		//Initialisationen
		init();
		
		// Trumf-kortet bliver vist for spilleren.
		System.out.println("");
		System.out.println("Trumf-kortet for dette spil er "+board.trumpCard());
		
		while(!board.gameOver()){
			System.out.println("");
			Player currentPlayer=board.next();
			if(currentPlayer.equals(player)){
				System.out.println("Det er spillerens tur.");
			
				// Tjekker hvem der vinder runden alt efter hvad spillerne har spillet.
				Card playerMove = playerChoiceOfCard();
				Card autoPlayerMove = autoPlayer.next(playerMove);
				System.out.println(autoPlayer.name() + " spillede: " +
				autoPlayerMove.toString());
		
				// Finder og printer vinderen af runden.
				Player winner = board.move(playerMove, autoPlayerMove);
		
				System.out.println(winner.name() + " er vinderen af runden.");
			}
			else{
				System.out.println("Det er " + autoPlayer.name() + "s tur.");
				// Autoplayeren vælger hvilket kort den vil spille.
				Card autoPlayerMove = autoPlayer.next();
		
				System.out.println(autoPlayer.name() + " spillede: " +
					autoPlayerMove.toString());
				System.out.println();
				Card playerMove = playerChoiceOfCard();
		
				//Tjekker hvem der vandt runden
				Player winner = board.move(autoPlayerMove, playerMove);
		
				System.out.println(winner.name() + " er vinderen af runden.");
			}
		}

		// Beregner og finder den endelige score for spilleren og modstanderen.
		int playerScore = finalScore(player.collectedCards());
		int autoPlayerScore = finalScore(autoPlayer.collectedCards());
	
		System.out.println(player.name()+" endte med "+playerScore+" point, og "+
			autoPlayer.name()+" endte med "+autoPlayerScore +"point");
		
		// Udregner og printer vinderen eller om det er uafgjort.
		if(playerScore > autoPlayerScore)
			System.out.println(player.name()+" er vinderen af spillet");
		else if(playerScore==autoPlayerScore)
			System.out.println("Et sjællendt tilfælde, men det blev uafgjort.");
		else
			System.out.println(autoPlayer.name()+" er vinderen af spillet");
		}
				
	/*
	* Initialiserer spillet samt tager input til spillernavn og informere spilleren om regleren i spillet.
	*/
	public static void init(){
		// introduktion.
		// bestemmer spillernavnet.
		System.out.println("Et kortspil af Christian, Mikkel og Rasmus.");
		System.out.println("Først og fremmest, hvad er dit navn?");
		scanner=new Scanner(System.in);
		String name=scanner.nextLine();
		
		// sætter spillet op.
		player=new Player(name);
		autoPlayer=new AutoPlayer("Modstanderen");
		board=new Board(player, autoPlayer);

		// fortæller reglerne.
		System.out.println("Okay, "+name+", reglerne er simple: ");
		System.out.println("1. I starten af spillet vil hver spiller få 3 kort");
		System.out.println("2. Vinderen af den tidligere runde begynder");
		System.out.println("3. En trumf-type vil derefter blive valgt gennem et kort(f.eks Hjerte konge, trumf-type=Hjerte)");
		System.out.println("4. Hvis spiller 2 bruger et kort, som har højere værdi og samme type som spiller 1's kort, så vinder spiller 2 runden");
		System.out.println("5. Hvis spiller 2 bruger et kort af trumf-typen, og første spiller ikke gjorde, så vinder spiller 2 runden");
		System.out.println("6. I alle andre tilfælde, så vil spiller 1 vinde runden");
		
		System.out.println(" ");
		System.out.println("For at vinde gælder følgende");
		System.out.println("1. Når der ikke er flere kort tilbage i kortdækket, så fortsætter spillerne, indtil at de ikke har flere kort tilbage i hånden");
		System.out.println("2. Spillernes score er bestemt udfra kortenes værdi i deres bunke med vundne kort");
		System.out.println("3. Kortenes værdi er som følgende: Es, Syver, Konge, Knægt og Dronning. Deres værdier er henholdsvis: 11, 10, 4, 3 and 2.");
	}
	
	/*
	* Lader spilleren beslutte sig for hvilket kort han/hun vil spille ud fra hvilke kort der er i hånden.
	*/
	public static Card playerChoiceOfCard(){
		// Spilleren vises hans/hendes hånd.
		System.out.println("De nuværende kort du har på hånden er: ");
		System.out.println(Arrays.toString(player.hand()));
		System.out.println("Vælg et kort du vil spille, ved brug af 1-3");
		Card[] hand=player.hand();
		
		// Lader spilleren vælge et kort fra hånden, mellem 1 og antal kort på hånden.
		int pickedCard=0;
		pickedCard=scanner.nextInt()-1;
		if(pickedCard < 0 || pickedCard >= hand.length)
			System.out.println("Ugyldig værdi, vælg et tal mellem 1 og "+hand.length);
		return hand[pickedCard];
	}
	
	/* 
	 * Finder og returnerer scoren for spillerne.
	 */
	private static int finalScore(Card[] cards){
		int currentScore=0;
		for(Card card:cards){
			currentScore=currentScore+card.points();
		}
		return currentScore;
	}
}