
public class TwoOperand4 {
	public static void main(String[] args) {
		// 비트 이동 연산자 : >>, <<
		// 2진수 연산 
		System.out.println("1 << 3 = "+ (1 << 3));
		System.out.printf("1      = %8s\n", Integer.toBinaryString(1));
		System.out.printf("(1<<3) = %8s\n", Integer.toBinaryString(1<<3));
		
		System.out.println();
		System.out.println("-8 >> 3 = "+ (-8 >> 3));
		System.out.printf("-8      = %8s\n", Integer.toBinaryString(-8));
		System.out.printf("(-8>>3) = %8s\n", Integer.toBinaryString(-8>>3));
	}
}
