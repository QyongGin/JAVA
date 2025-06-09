import java.util.Scanner; // 자바 유틸 스캐너 라이브러리 호출 

public class AreaEx {

	public static void main(String[] args) {
		Area areaEx = new Area(); // 새로운 Area 객체 생성, areaEx가 참조.
		Scanner sc = new Scanner(System.in); // 새로운 Scanner 객체 생성, 매개변수는 시스템 입력.
		System.out.print("반지름을 입력하라. : ");
		
		System.out.println("원의 면적 : " + areaEx.areaCal(sc.nextDouble())); 

		System.out.println("정사각형의 넓이 : " + areaEx.areaCal(sc.nextInt()));
		
		System.out.println("직사각형의 넓이 : " + areaEx.areaCal(sc.nextInt(), sc.nextInt()));
		
		System.out.println("Test : " + Area.areaCal(3.4,3)); // 객체 생성 필요없이 클래스로 바로 접근해서 사용한다.
	}

}
