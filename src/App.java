import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
// 2. Create a class named App with main method

//3. Instantiate a Deck and two Players,
  // call the shuffle method on the deck.
		
		Deck cardDeck = new Deck();
		List <Card> hand1 = new ArrayList<Card>();
		List <Card> hand2 = new ArrayList<Card>();
		
		cardDeck.shuffle();
		
		
	}
	private Player Playerx;
	private Player Playery;
	private static Deck deck;
{
// 4. Using a traditional for  loop, iterate 52 times calling the Draw method on the other player
   // each iteration using the Deck you instantiated.
	
		Player x = new Player();
		Player y = new Player();
		for(int i = 0; i < 52; i++) {
			if ( i % 2 ==0) {
				x.draw(deck);
			} else {
				y.draw(deck);
			}

}
		System.out.println("\nDescription of Players : ");
		System.out.println("\nPlayerx: ");
		Playerx.describe();
		
		System.out.println("\nPlayery: ");
		Playery.describe();
		
		
// 5. Using a traditional for loop, iterate 26 times and call the flip method for each player.
		for (int drawCards = 0; drawCards < 26; drawCards++) {
			Playerx.draw(deck);
			Playery.draw(deck);
		}
		
		
		for(int flips = 0; flips < 26; flips++) {
			
			Playerx.flip();
			Playery.flip();
			System.out.println("Player a flipped : " + Playerx.flip());
			System.out.println("Player b flipped : " + Playery.flip());
		}	
// 5. a. Compare the value of each card returned by the two player’s flip methods. 		
// 	Call the incrementScore method on the player whose card has the higher value	
		if(Playerx.getValue() >  Playery.getValue()) {
			Playerx.incrementScore();
		} else if (Playerx.getValue()< Playery.getValue()) {
			Playery.incrementScore();
		}
		System.out.println("Player x score = " + Playerx.getScore());
		
		System.out.println("Player y score = " + Playery.getScore());
		
		if(Playerx.getScore() > Playery.getScore()) {
			System.out.println("Player x wins!");
		} else if (Playerx.getScore() < Playery.getScore()) {
			System.out.println("Player y wins!");
		}
		
}
}
