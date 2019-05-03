package andereAufgaben;

import java.util.HashMap;
import java.util.Set;

public class AndereAufgaben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hash Maps mit Strings
		String buchTitel = "das blaue Wunder";
		int buchAnzahl = 15;
		
		// Initialisierung der HashMap
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// Buchtitel + Buchanzahl hinzufügen:
		map.put(buchTitel, buchAnzahl);
		map.put("Böööses Erwachen", 0);
	
		
		// map.get benötigt den key, in diesem Fall die erste Variable
		// die wir deklariert haben (zu vergleichen mit Vokabeln:
		// die eine Vokabel Vogel wird immer mit Bird assoziiert
		//System.out.println(map.get("das blaue Wunder")); // Printed: 10
		
		BuchVerwalter bv = new BuchVerwalter();
		
		bv.neuesBuch(buchTitel, buchAnzahl);
		bv.neuesBuch("Peter Lustig", 0);
		
		bv.zeigeBücher();
		
		bv.passeBuchzahlAn("Peter Lustig", 5, true);
		bv.passeBuchzahlAnAlt("Peter Lustig", 10, true);
		
		
		
	}

}
