package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
		assertFalse(doBracketsMatch("}}}}}}}}"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	
	Stack <Character> entered =  new Stack <Character>();
	char openBracket = '{';
	
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
			
			if (b.charAt(i) == '{') {
				entered.push('a');
			}else {
				if (entered.size() > 0) {
					entered.pop();
				}else {
					return false;
				}
			}
			
		}
		if (entered.isEmpty()) {
			return true;
		}else
			return  false;
		
	

	}
	

}