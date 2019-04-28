package MiniBar;

import java.util.ArrayList;

public class RecipeCollector {

	// ArrayList wird erstellt
	private ArrayList<Recipe> recipies = new ArrayList<Recipe>(); // nimmt nur die Objekte des Typs Receipt!!!
	
	/** 
	 * 
	 * @param receipt
	 */
	public void addRecipe (Recipe recipe) {
		recipies.add(recipe); 
	}
	
	
	/** Method shows recipe. 
	 * durch indexOf(String t) wird im Array nach gewünschtem Titel gesucht, zur Zuweisung -1, 1 ob in der Liste, oder nicht
	 * @param title String
	 * @return Required recipe
	 */ 
	public String showRecipies(String title) {
		
		// lokale Variable (in diesem Fall unser Objekt)
		// : recipies ist unsere Referenzvariable (in diesem Fall der
		// Name unserer Arraylist
		for (Recipe recipe : recipies) {
			
			if (recipe.getTitle().equals(title)){
				return recipe.toString(); 
			} 	
		}
		return "No title has been found. Sorrü.";
		}
}	
//  indexOf = sucht aus einer eventuellen Gruppe von Objekten (Array) nach dem Index von
//	einem bestimmten Objekt. Der Suchparameter muss dem gleichen Datentypen angehören:
//  deswegen geht das so nicht: title ist String und wir suchen nach einem bestimmten Objekt 		
//		int index = recipies.indexOf(title); 
//		if (index == -1) {
//			return "No title has been found. Sorrü.";			
//		} else {
//			return recipies.get(index).toString();
//		}
		
