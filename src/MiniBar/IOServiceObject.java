package MiniBar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOServiceObject {

	// Initialisierung der Array Listen:
	private ArrayList<Recipe> recipies = new ArrayList<Recipe>();
	private ArrayList<RecipeCollector> recipeCollections = new ArrayList<RecipeCollector>();
	
	// Grundpfad angeben (kann von jedem Rechner erreicht werden) :
	private String basePath = System.getProperty("user.dir") + "\\ordnerRezepte\\";
	
	private String filenameRecipies = basePath + "recipies.txt";
	private String filenameRecipeCollections = basePath + "recipeCollections.txt"; 
	
	// Erstellt Ordner:
	public void createFolder() {
		new File (basePath).mkdir();
	}
	
	// Write Methode erstellen:
	// append ist ein optionaler Parameter, der im default auf false gesetzt ist
	public void write(Object object, boolean append) {
		
		if(object instanceof Recipe) {
			
			try {
			FileOutputStream fos = new FileOutputStream(filenameRecipies, append);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object);
			
			oos.flush();
			fos.close();
			oos.close();
			
			System.out.println("Speichern erfolgreich.");
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace(); 
			}
			
		} else if (object instanceof RecipeCollector) {
			
			try {
			FileOutputStream fos = new FileOutputStream(filenameRecipeCollections, append);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(object);
			
			oos.flush();
			fos.close();
			oos.close();
			
			System.out.println("Speichern erfolgreich.");
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace(); 
			}
		} else {
			System.out.println("Du Troll!");
		}
		
		
	}
	
	public Object readObject(boolean isRecipe) {
		
		Object object = null; 
		
		if(isRecipe = true) { 
		
			try {
				FileInputStream fis = new FileInputStream(filenameRecipies);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				object = ois.readObject();
				
				ois.close();
				fis.close();
			
			} catch (Exception e) {
			e.printStackTrace();
			}
		} else if (isRecipe = false) {
			
			try {
				FileInputStream fis = new FileInputStream(filenameRecipeCollections);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				object = ois.readObject();
				
				ois.close();
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return object; 
	}
	
}
