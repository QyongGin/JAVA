
public class ThreeOperand {
	public static void main(String[] args) {
		//삼항 연산자 => (조건식) ? true실행 : false 실행;
		int num1 = 35;
		int num2 = 47;
		String result;
		
		result = (num1 > num2) ? "num1이 더 크다" : "num2가 더 크다"; // result string 변환해서 string으로 값을 주어야한다.
		System.out.println(result);
		
		boolean bResult = (num1 > num2) ? true : false;
		System.out.println(bResult);
		
		int score = 85;
		result = (score >= 90) ? "우수" : ((score >= 80) ? "보통" : "미달");
		System.out.println(result);
	}
}
