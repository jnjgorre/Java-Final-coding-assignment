import java.util.ArrayList;
import java.util.List;

public class Player {
	
// 1.c Create a class Player
	// i. Fields
	public List<Card> hand = new ArrayList<Card>();
private int score;
	
	
	// Constructor 
	public Player() {
		setScore(0);
		
	}
	private void setScore(int i) {
		
		
	}
	// ii. Methods
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck ofCards) {
		hand.add(ofCards.draw());
		
	}
	public int handSize() {
		return hand.size();
	}
	public void incrementScore() {
		this.score += 1;
		
	}
	public boolean getScore() {
	return this.getScore();
	
	}
	public void describe() {
		
		
	}
	public String name() {
		
		return name();
	}
	public boolean getValue() {
		
		return true;
	}
	
	}
	
	
	
	
	
	
	
	

