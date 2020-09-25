import java.util.Scanner;

public class JavaIf {
	private static boolean heater = false; // 
	
	public static void main(String[] args) { 
 			Scanner dataInput = new Scanner(System.in);
 			System.out.println("Please input temperature: ");
			double temp = dataInput.nextDouble();
 			switchHeater(temp);
 			System.out.println(temp);
 			System.out.println("Temperature is: " + temp + " & heater - " + switchHeater(temp));
 			dataInput.close();

	}

	public static boolean switchHeater(double temp) {
		String value = "OFF";
		if (temp <= 20) {
			heater = true;
			value = "ON";
		}
		
		return value + 12;
	}
}
