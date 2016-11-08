package main;

public class WordSmith {

	public static String CheckInput(int value) {
		if ((value % 3) == 0) {
			return "word";
		}
		return String.valueOf(value);
	}

}
