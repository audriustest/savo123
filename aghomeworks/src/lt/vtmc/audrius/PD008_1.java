package lt.vtmc.audrius;

import java.util.Arrays;

public class PD008_1 {

	public static void main(String[] args) {
		double[] products = new double[6];
		products[0] = 102.56;
		products[1] = 215.72;
		products[2] = 99.21;
		products[3] = 200;
		products[4] = 175.99;
		products[5] = 214.99;
		
		double totalSalesSum = products[0] + products[1] + products[2] 
				+ products[3] + products[4]+ products[5];
		
		double avgProductPrice = totalSalesSum/6;
		
		
		float avgProductPriceRounded = (float) avgProductPrice;
		
		
		System.out.println("Parduota prekių už sumą: "
				+ totalSalesSum);
	
	
		System.out.println(avgProductPriceRounded);
	}

}
