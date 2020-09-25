
public class JavaWhile {

	private static double cash = 1200;
	
	
	public static void main(String[] args) {
		
		int counter = 0;
		double price = 21;```
		while (cash >= price ) {
			cash -= price;	 
			counter++;
			System.out.println("Money: " + cash);
			
		}
			
	System.out.println(counter);

	}

}
