
public class Calculator {
	String color;
	String size;
	
	public Calculator(String color, String size) {
		this.color = color;
		this.size = size;
	}
	// 전원켜기
	// 리턴값이 없는 경우
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 전원끄기
	// 리턴값이 없는 경우
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	void exec() {
		double result = avg(7,10);
		printFunc("실행결과: " + result);
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	private void printFunc(String strMsg) {
		System.out.println(strMsg);
		
	}
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}
	
	int sum2(int...values) {
		int sum = 0;
		for(int i=0; i<values.length; i++)
			sum += values[i];
		return sum;
	}

}
