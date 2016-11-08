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

	public void testReturnsSmith() {
		String expected = "smith";
		String result = WordSmith.CheckInput(5);
		assertEquals(expected, result);
	}

	public void testReturnsWordSmith() {
		String expected = "wordsmith";
		String result = WordSmith.CheckInput(15);
		assertEquals(expected, result);
	}

	public void testAdditionalReturnsInputAsString(){
		String expected = "32";
		String result = WordSmith.CheckInput(32);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsWord(){
		String expected = "word";
		String result = WordSmith.CheckInput(33);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsSmith(){
		String expected = "smith";
		String result = WordSmith.CheckInput(35);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsWordSmith(){
		String expected = "wordsmith";
		String result = WordSmith.CheckInput(45);
		assertEquals(expected, result);
	}
}
