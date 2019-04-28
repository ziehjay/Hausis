package MiniBar;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recipe {

	private String title;
	private String author;
	private String ingredients;
	private String description; 
	// Unbedingt Initialisierung, reines deklarieren reicht nicht
	// NullPointerException - iwo nicht richtig initialisiert 
	private ArrayList<String> tags = new ArrayList<String>(); // <E> welche Typen werden erlaubt in der Array List, in diesem Fall: String
	
	
	public Recipe(String title, String author) {
		this.title = title;
		this.author = author; 
		
	}
	// Optionaler Konstruktor, nur mit Title
	public Recipe(String title) {
		this.title = title;

		
	}
	
	/** Adding new tags to receipt.
	 * 
	 * @param String tag, gets added to the array list.  
	 */
	public void addTag(String tag) {
		tags.add(tag); // add ist eine Methode, von ArrayList, sie fügt ein Element der Liste zu
		// nimmt nur Strings an, weil er mit "E" welche erwartet. 
		
	}
	/** Deleting tags of a receipt.
	 * 
	 * @param tag String, gets deleted in the array list.
	 * @return boolean if True = tag will be deleted, False = tag was not found
	 */
	public boolean deleteTag(String tag) {
		return tags.remove(tag);
		
	}
	
	public boolean findTag(String tag) {
		
		return tags.contains(tag);
		
	}
	
	@Override
	public String toString() {
		return "Title: " + title + 
				"\nAuthor: " + author +
				"\nIngredients: " + ingredients +
				"\nDescription: " + description +
				"\nTags: " + tags;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}

	
	
	public boolean setAuthor(String author) {
		
//		Pattern pattern = Pattern.compile("[A-Za-z]*"); // Alle zusammenhängenden Wörter werden ausgegeben
//		pattern = Pattern.compile("[a-z]{3}\\d{3}"); // a-z darf 3x vorkommen, Ziffern 0-9 dürfen 3x vorkommen
//		pattern = Pattern.compile("[a-z," // s.oben + erlaubte Umlaute
//				+ "\u00c4,\u00d6," // Aä
//				+ "\u00e4,\u00f6," // Öö
//				+ "\u00dc,\u00fc," // Üü
//				+ "\u00df]{3}\\d{3}"); // ß
//		
//		pattern = Pattern.compile("[A-Za-z]+" // Ersten Teil des Vornamens
//				+ "((\\-[A-Za-z]+)|" // Optional durch Veroderung: Zweiten Teil des Vornames
//				+ "(\\s" // Wichtig: Space zur Trennung zum Nachnamen ... 
//				+ "[A-Za-z]+))"); 
		
		// meine Versuche:
		// Jan-Uwe Klausen, Jan Klausen
		// Filtert Jan-: [aA-zZ]+\\-?"
		// Filter Jan UND Jan-Uwe
		String authorRegex = "([A-Z]{1}[a-z]{1,30}|[A-Z]{1}[a-z]{1,30}+)|"
				+ "([A-Z]{1}[a-z]{1,30}+[- ])"
				+ "[A-Z]{1}[a-z]{1,30}";
				
//		String authorRegex = "[A-Za-z]+" // Ersten Teil des Vornamens
//				+ "((\\-[A-Za-z]+)|" // Optional durch Verorderung: Zweiten Teil des Vornames
//				+ "(\\s" // Wichtig: Space zur Trennung zum Nachnamen ... 
//				+ "[A-Za-z]+))";
//				
		// Peter-Uwe Knechten soll auch gehen!! Momentan geht nur: Peter-Uwe und Uwe Knechten


		
		
		//Matcher matcher = pattern.matcher(author);
		
		if(author.matches(authorRegex)) {
			System.out.println("yoooo");
			System.out.println(author);
			
			this.author = author;
			return true;
			
		}else{
			System.out.println("nöööö");
			System.out.println(author);
			
			return false;
		}
		

		
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	public ArrayList<String> getTags() {
		return tags;
	}


	
	
	
	
}
// Rezept: Titel, Autor, Liste von Zutaten (Menge der Zutaten mit String erstmal), Beschreibung, Schlagwörter
// Rezept-Klasse hat einen Konstruktor: als Parameter den Titel und OPTIONAL den Author
// Methode: zum Hinzufügen von Schlagwörtern UND Entfernen von Schlagwörter 


// Überschreibt die toString-Methode so, dass ihr die Attribute des Rezeptes auf eine
// benutzerfreundliche Art und Weise ausgebt.