package lt.vtmc.audrius.datatypes;

public class PU001 {

	public static void main(String[] args) {
		
		pu001a();
		pu001b();
		pu001c();
		pu001d();
		pu001e();
		
	}
		private static void pu001a() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java");
		System.out.println("Learning Java Now");
		System.out.println("Programing is fun");

		}
		
		private static void pu001b(){
			System.out.println("Crazy Java \n" + "Crazy Java \n" + "Crazy Java \n" + "Crazy Java \n" + "Crazy Java \n");
		}
	
		private static void pu001c() {
			// TODO Auto-generated method stub
			System.out.println("J        A        V     V        A");
			System.out.println("J       A A        V   V        A A");
			System.out.println("J      A A A        V V        A A A");
			System.out.println("JJ    A     A        V        A     A");
			
		
		}
		
		private static void pu001d() {
			System.out.println("a\t\t a^2\t\t a^3\t\t a^4");
			System.out.println("1\t\t 1\t\t 1\t\t 1");
			System.out.println("2\t\t 4\t\t 8\t\t 16");
			System.out.println("3\t\t 9\t\t 27\t\t 81");
			System.out.println("4\t\t 16\t\t 64\t\t 256");
			
		}
		
		private static void pu001e() {
			double leftTop = 7.5*6.5-4.5*3;
			double leftBottom = 47.5-5.5;
			double leftResult = leftTop / leftBottom;
			float rightTop = 12.78f;
			double rightBottom = 15.4-2.75;
			double rightResult = rightTop / rightBottom;
			
			boolean compareSides = (leftResult == rightResult);
			
			System.out.println(compareSides);
		}
	


}
