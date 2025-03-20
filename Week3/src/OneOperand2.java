
public class OneOperand2 {

	public static void main(String[] args) {
		// 단항연산자 : 증감 연산자 ( ++, -- )
		
		int x = 10;
		int y = 10;
		int z;
		
		//	 ++연산자 : 피연산자의 기존 값에 1을 더해준다. 
		// ++기호가 왼쪽(앞)에 있는 경우 : 먼저 1을 더하고 명령문을 실행.
		System.out.println("++x = " + (++x)); 
		
		// ++기호가 오른쪽(뒤)에 있는 경우, 명령문을 먼저 실행하고 다음 라인으로 넘어가면서 1증가
		System.out.println("x++ = " + (x++));
		System.out.println("x = " + x);
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
