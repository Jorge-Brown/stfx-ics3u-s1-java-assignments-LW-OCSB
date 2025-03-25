package lessons;

public class DoWhileLoop {

	public static void main(String[] args) {

		// do-while loops are exactly like while loops, except the
		// block of code is executed at least once
		
		int counter = 0;
		
		do  {
			
			System.out.println("Hello World!");
			counter++;
			
		} while (counter < 3);
		
	}

}
