package MiniBar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

class TestMiniBar {
	
	

	@Test
	void testsetTitle() {
		
		// erstelle ein Objekt der Klasse Recipe
		Recipe hühnersuppe = new Recipe("Hühnersuppe","Mr.P");
		String title = "Tomatensuppe";
		
		// Setze "Tomatensuppe" als neuen Titel
		hühnersuppe.setTitle(title);
		
		// teste ob "Tomatensuppe" mit getTitle zurückgegeben wird:
		assertEquals(title, hühnersuppe.getTitle());
	}
	
	@Test
	void testaddTag() {
		
		Recipe testrezept = new Recipe("testTitle", "Test Author");
		
		String tag = "tomate";
		testrezept.addTag(tag);
		
		assertEquals(true,testrezept.findTag(tag));

	}	
	
	
	@Test 
	void testregexAuthor() {
		
		Recipe testrezept = new Recipe("testTitle", "Test Author");
		
		assertEquals(true, testrezept.setAuthor("Peter"));
		testrezept.setAuthor("Peter ");
		testrezept.setAuthor("Peter Klas");
		testrezept.setAuthor("Peter-");
		testrezept.setAuthor("Peter-Uwe");
		testrezept.setAuthor("Peter-Uwe Klausen-Mausen");	
	}
	
	@Test
	void testregexTitle() {
		
		Recipe testrezept2 = new Recipe("testTitle", "Test Title");
		assertEquals(true, testrezept2.setTitle("Best of Cock. 2,5"));
		assertEquals(true, testrezept2.setTitle("Drink It 2"));
		assertEquals(false, testrezept2.setTitle("Virgin Col@da"));
		assertEquals(true, testrezept2.setTitle("Cocktails"));
		
	}
}
