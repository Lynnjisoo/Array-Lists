import java.util.ArrayList;


public class SnowWhite {
	
	public static void main(String[] ARGS) {
		ArrayList<String> Characters = new ArrayList<String>();
		
		Characters.add("Narrator");
		Characters.add("Snow White");
		System.out.println(Characters.get(0) + ": A Beautiful girl, Snow White, was living in the forest with the seven dwarfs, Sneezy, Dopey, Grumphy, Bashful, Happy, Sleepy, and Doc. ");
		
		Characters.add("Sneezy");
		Characters.add("Dopey");
		Characters.add("Grumphy");
		Characters.add("Bashful");
		Characters.add("Happy");
		Characters.add("Sleepy");
		Characters.add("Doc");
			
		
		if(Characters.contains("Sleepy")) {
			System.out.println(Characters.get(Characters.indexOf("Sleepy")) + ": Hi!");
		}
		else {
			System.out.println("Dwarfs: Hi! Sleepy is slepping. ");
		}		
		
		System.out.println(Characters.get(0) +  ": Because of her stepmother, the wicked Queen, snow White had to hide from her death. ");


		
		System.out.println(Characters.get(0) + ": The dwarfs grow to love their unexpected visitor, who cleans their house and cooks their meals. " );
		
		Characters.add("Queen");
		Characters.add("Magic Mirror");

		System.out.println(Characters.get(9) + ": Mirror Mirror on the wall. Who is the most beautiful lady in the world?");
		System.out.println(Characters.get(10) + ": Famed is the beauty, majesty. BUT Snow White with the seven dwarf is more fair than you. ");
	
		Characters.remove("Magic Mirror");
		
		System.out.println(Characters.get(0) + ": One day, while the dwarfs are at their diamond mine, the Queen arrives at the cottage disguised as an old peddler woman and persuades Snow White to bite into a poisoned apple.");
		Characters.remove("Sneezy, Dopey, Grumphy, Bashful, Happy, Sleepy, Doc");
		
		System.out.println(Characters.get(0) + ": As Snow White bite the poisoned apple, she collapsed.");
		
		Characters.add("Sneezy, Dopey, Grumphy, Bashful, Happy, Sleepy, Doc");
		System.out.println(Characters.get(0) + ": The dwarfs, warned by the forest animals, rush home, and place her in a glass coffin in the woods and mourn for her. ");

		Characters.add("Prince");
		System.out.println(Characters.get(0) + ": The Prince, who has fallen in love with Snow White, happens by and awakens her from the wicked Queen's deathlike spell with 'love's first kiss.'");
		
		System.out.println(Characters.get(0) + ": Snow White and the prince lived happily ever after. ");
		
	}
	

}


/*ArrayList<String> Students = new ArrayList<String>();
 * Students.add("Bucky");
 * Students.add("Steve");
 * Students.add("Tony");
 * System.out.println(Students);
 * Students.remove("Bucky");
 * 	if(Students.contains("Peter")) {
 * 	System.out.println("Peter is here");
 * } else {
 * System.out.println("Peter is not here.")
 */
