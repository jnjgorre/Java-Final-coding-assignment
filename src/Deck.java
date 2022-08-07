import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

// b. Create a class Deck
	// i. Fields
		// 1. Cards (List of Card)
	List<Card> deck = new ArrayList<Card>();

	private ArrayList<Card> Card;
	
	private static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
	private static final String[] nameOfCards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	
	//Constructor
	public Deck() {
		Card = new ArrayList<Card>();
				
		}
				
		
// b. ii. Methods
		// 1. Shuffle
		public <Cards> void shuffle() {
			Collections.shuffle(deck); {
		}
		 
			}
		
		
			
	
		public Card draw() {
			
			return(Card);
			
		}
}
