
public class CalcEx {
	
	static double mtest (int x, int y) { 
		return x / y;
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small");
		System.out.println(c1.color + "," + c1.size);
		
		int result1 = c1.plus(10, 20);
		System.out.println("plus(10,20) = " + result1);
		
		double result2 = c1.divide(10, 20);
		System.out.println("divide(10,20) = " + result2);
		
		byte b1 = 10;
		byte b2 = 20;
		result2 = c1.divide(b1,  b2);
		System.out.println("divide(10,20) = " + result2);
		
		c1.exec();

		int sum1 = c1.sum1(new int[] {1,2,3,4,5});
		System.out.println("{1,2,3,4,5,} = " + sum1);
		
		int sum2 = c1.sum2(1,2,3,4,5);
		System.out.println("(1,2,3,4,5) = " + sum2);
		
		System.out.println(mtest(7,3));
		
	}

}
