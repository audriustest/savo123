package PD006;

public class PD006_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wallHeight = 400;
		int wallWidth = 300;
		int wallSize = wallHeight * wallWidth;
		int bricketHeight = 10;
		int bricketWidth = 20;
		int bricketSize = bricketHeight * bricketWidth;
		double bricketPrice = 0.5;
		
//		
//		
		int totalBrickets = wallSize / bricketSize;
		double bricketsPriceTotal = totalBrickets * bricketPrice;
		int bricketsPricePublic = (int)bricketsPriceTotal;
		
		System.out.println("kiek reiks plytu:" + totalBrickets);
		
		
		System.out.println("kiek kainuos:" + bricketsPricePublic);
		
//		
		
		
		
		
	}
}
		