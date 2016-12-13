package test;

import junit.framework.TestCase;
import main.FizzBuzz;

public class WordSmithTest extends TestCase{


	public void testReturnsInputAsString() {
		String expected = "1";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(1);
		assertEquals(expected, result);
	}

	public void testReturnsWord() {
		String expected = "word";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(3);
		assertEquals(expected, result);
	}

	public void testReturnsSmith() {
		String expected = "smith";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(5);
		assertEquals(expected, result);
	}

	public void testReturnsWordSmith() {
		String expected = "wordsmith";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(15);
		assertEquals(expected, result);
	}

	public void testAdditionalReturnsInputAsString(){
		String expected = "32";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(32);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsWord(){
		String expected = "word";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(33);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsSmith(){
		String expected = "smith";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(35);
		assertEquals(expected, result);
	}

	public void testAddtionalReturnsWordSmith(){
		String expected = "wordsmith";
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		String result = wordSmith.CheckInput(45);
		assertEquals(expected, result);
	}
}
