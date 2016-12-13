package main;

public class FizzBuzz {

	private String fizz;
	private String buzz;

	public String getFizz() {
		return fizz;
	}

	public void setFizz(String fizz) {
		this.fizz = fizz;
	}

	public String getBuzz() {
		return buzz;
	}

	public void setBuzz(String buzz) {
		this.buzz = buzz;
	}

	public FizzBuzz() {
		this.fizz = "Fizz";
		this.buzz = "Buzz";
	}

	public FizzBuzz(String fizz, String buzz) {
		this.fizz = fizz;
		this.buzz = buzz;
	}

	public String CheckInput(int value) {
		String result = String.valueOf(value);
		if (divisibleByThree(value) && divisibleByFive(value)) {
			result = this.fizz + this.buzz;
		}
		else if (divisibleByThree(value)) {
			result =  this.fizz;
		}
		else if (divisibleByFive(value)) {
			result = this.buzz;
		}
		return result;
	}

	private static boolean divisibleByThree(int value) {
		return ((value % 3) == 0);
	}

	private static boolean divisibleByFive(int value) {
		return ((value % 5) == 0);
	}


}
