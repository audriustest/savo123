public class JavaSwitch {
	
	private static String cart;
	private static final int HOUR = 20; // konstanta
	
	public static void main(String[] args) {
		
		
		cart = "beer";

		if (cart.equals("beer") & HOUR >= 20) {
			cart = "milk";
		}
		
		switch (cart) {
		case "beer":
			System.out.println("No beer");
			break;
		case "milk":
			System.out.println("You can buy milk");
			break;
		default:
			System.out.println("Nothing");
			break;
		};

	}

}
