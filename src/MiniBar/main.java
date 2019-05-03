package MiniBar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Recipe nudelsuppe = new Recipe("Nudelsuppe","Mr. P");
		
		RecipeCollector meineLieblingsrezepte = new RecipeCollector();
	
	
		meineLieblingsrezepte.addRecipe(nudelsuppe);
		
		System.out.println(meineLieblingsrezepte.showRecipies("Nudelsuppe"));	
		
		IOServiceObject ioService = new IOServiceObject(); 
		
		ioService.createFolder(); 
		
		ioService.write(nudelsuppe, true); 
		ioService.write(meineLieblingsrezepte, true); 
		
	}
}
