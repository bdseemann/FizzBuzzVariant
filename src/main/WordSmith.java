package main;

public class WordSmith {

	public static String CheckInput(int value) {
		if ((value % 3) == 0) {
			return "word";
		} else if ((value % 5) == 0) {
			return "smith";
		}
		return String.valueOf(value);
	}


}
