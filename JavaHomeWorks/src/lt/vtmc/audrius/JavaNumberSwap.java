package lt.vtmc.audrius;

public class JavaNumberSwap {
	
	public static void main(String[] args) {
		int numberOne = 10;
		int numberTwo = 20;
		numberChangerOne(numberOne, numberTwo);
	}
	
	static void numberChangerOne (int numberOne, int numberTwo) {
	int tmp = numberOne;
	numberOne = numberTwo;
	numberTwo = tmp;
	System.out.println(numberOne + "ir" + numberTwo);
	}

}
