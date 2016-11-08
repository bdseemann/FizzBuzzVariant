package test;

import junit.framework.TestCase;
import main.WordSmith;

public class WordSmithTest extends TestCase{


	public void testReturnsInputAsString() {
		String expected = "1";
		String result = WordSmith.CheckInput(1);
		assertEquals(expected, result);
	}

	public void testReturnsWord() {
		String expected = "word";
		String result = WordSmith.CheckInput(3);
		assertEquals(expected, result);
	}

}
