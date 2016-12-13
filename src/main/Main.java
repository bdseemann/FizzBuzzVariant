package main;

public class Main {

	public static void main(String[] args) {
		FizzBuzz wordSmith = new FizzBuzz("word", "smith");
		for (int i = 0; i <= 100; i++) {
			System.out.println(wordSmith.CheckInput(i));
		}
	}
}
