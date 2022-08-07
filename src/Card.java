
public class Card {

// 1. Create Card class
	
// i. Fields: 1. Value
		   // 2. Name
	public static int value[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	public static String name[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
	
	//constructor
	public Card(int[] value, String[] name) {
		Card.value = value;
		Card.name = name;
	}
	
	
	
	
// ii. Methods: 1. Getters and Setters
			 
	

	public Card(String string, String string2) {
		
	}

	public Card(String[] nameofcards, String[] suits) {
		
	}




	//getter for value
	public int[] getValue() {
		return value;
	}
	//setter for value
	public void setValue(int[] value) {
		Card.value = value;
	}
	//getter for name
	public String[] getName() {
		return name; 
	}
	//setter for name
	public void setName(String[] name) {
		Card.name = name;
	}
// ii. Methods: 2. Describe (prints out info about a card)
	public void describe() {
		System.out.println(name + "has value of: " + value );
	}

	public static String MakeCardName(int i, int j) {
		
		return (" ");
	}




	public static Object remove(int i) {
		
		return(" ");
	}

}
