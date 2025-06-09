
public class Area {
	
	// 메소드의 이름은 모두 같다. 매개변수의 타입과 개수가 다르다.
	// 매개값에 따라 areaCal의 역할이 달라진다.
	
	double areaCal(double radius) {
		return 3.14 * radius * radius;
	}
	
	int areaCal(int width) {
		return width * width;
	}
	
	int areaCal(int width, int height) {
		return width * height;
	}
	
	static double areaCal(double test, int test2) { // 정적 멤버 static 선언 Area 객체를 여러 개 만들어도 
													//static 필드는 객체 사이에서 공통으로 사용된다.
		return test * test2;
	}
}
