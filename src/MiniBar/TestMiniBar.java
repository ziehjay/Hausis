package MiniBar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class TestMiniBar {
	
	

	@Test
	void testsetTitle() {
		
		// erstelle ein Objekt der Klasse Recipe
		Recipe h�hnersuppe = new Recipe("H�hnersuppe","Mr.P");
		String title = "Tomatensuppe";
		
		// Setze "Tomatensuppe" als neuen Titel
		h�hnersuppe.setTitle(title);
		
		// teste ob "Tomatensuppe" mit getTitle zur�ckgegeben wird:
		assertEquals(title, h�hnersuppe.getTitle());
	}
	
	@Test
	void testaddTag() {
		
		Recipe testrezept = new Recipe("testTitle", "Test Author");
		
		String tag = "tomate";
		testrezept.addTag(tag);
		
		assertEquals(true,testrezept.findTag(tag));

	}	
	
	
	@Test 
	void testregexTitle() {
		

		Recipe testrezept = new Recipe("testTitle", "Test Author");
		//testrezept.setAuthor("Peter-Uwe");
		testrezept.setAuthor("Peter");
		testrezept.setAuthor("Peter ");
		testrezept.setAuthor("Peter Klausen");
		testrezept.setAuthor("Peter-");
		testrezept.setAuthor("Peter-Uwe");
		
		testrezept.setAuthor("Peter-Uwe Klausen");
	
		
		
	}
}
