
public class TwoOperand5 {
	public static void main(String[] args) {
		// 복합 대입 연산자 : =+, -=, *=, /+, %=, ....
		int result = 10;
		int result2 = result + 10;
		// 변수의 재활용
		// result = result + 10;
		result += 10;
		System.out.println(result);
		
		// result = result -3;
		result -= 3;
		System.out.println(result);
		
		// result = result * 5;
		result *= 5;
		System.out.println(result);
		
		// result = result / 6;
		result /= 6;
		System.out.println(result);
		
		// result = result % 4;
		result %= 4;
		System.out.println(result);
	}
}
