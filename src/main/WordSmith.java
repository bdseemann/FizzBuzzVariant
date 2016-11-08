package main;

public class WordSmith {

	public static String CheckInput(int value) {
		if (divisibleByThree(value)) {
			return "word";
		} else if (divisibleByFive(value)) {
			return "smith";
		}
		return String.valueOf(value);
	}

	private static boolean divisibleByThree(int value) {
		if ((value % 3) == 0) {
			return true;
		}		
		return false;
	}

	private static boolean divisibleByFive(int value) {
		if ((value % 5) == 0) {
			return true;
		}		
		return false;
	}
}
