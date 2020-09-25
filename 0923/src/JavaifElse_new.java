import java.util.Scanner;

public class JavaifElse_new {
	private static String value;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		byte number = input.nextByte(); 
		if(number < 7 ) {
			value = "No";
		} else {
			value = "Yes";
		}
		System.out.println("...");
		input.close();

	}

}
