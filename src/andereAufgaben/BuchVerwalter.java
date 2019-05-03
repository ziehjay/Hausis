package andereAufgaben;

import java.util.HashMap;
import java.util.Set;

public class BuchVerwalter {

	HashMap<String, Integer> books = new HashMap<String, Integer>();
	
	public BuchVerwalter() {
		
	}
	
	public void neuesBuch(String buchTitel, int buchAnzahl) {
		books.put(buchTitel, buchAnzahl);
	}
	
	public void passeBuchzahlAn(String buchTitel, int neueAnzahl, boolean ausleihe) {
		Set<String> setOfKeys = books.keySet(); // Brauchen wir, um an die Values zu komen
		// weil HashMaps keine Indexe besitzen
		
		for (String currentKey : setOfKeys) {
			
			
			if(buchTitel.equalsIgnoreCase(currentKey)) {
				
				if(ausleihe == true) {
					books.put(currentKey, books.get(currentKey) + neueAnzahl);
				} else {
					books.put(currentKey, books.get(currentKey) - neueAnzahl);
					
				}
				
				System.out.println("Key: "+currentKey +"\nValue: "+books.get(currentKey));
			}
			
		}
	}
	
	
	public void passeBuchzahlAnAlt(String buchTitel, int neueAnzahl, boolean ausleihe) {
		
		if(ausleihe == true) {
			books.put(buchTitel, books.get(buchTitel) + neueAnzahl);
		} else {
			books.put(buchTitel, books.get(buchTitel) - neueAnzahl);
		}
		
		System.out.println(buchTitel + "   : Anzahl: " + books.get(buchTitel));
	}
	
	public void zeigeBücher() {
		Set<String> setOfKeys = books.keySet(); // Brauchen wir, um an die Values zu komen
		// weil HashMaps keine Indexe besitzen
		
		for (String currentKey : setOfKeys) {
	
			System.out.println("Key: "+currentKey);
			System.out.println("Value: "+books.get(currentKey));


		}
	}
	
	
}
