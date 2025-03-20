package Week2;

public class Print {
	//main 메소드는 반드시 필요 => JVM이 프로그램을 실행할 때 시작점
	//main 단축키 : main + crtl + spacebar
	
	public static void main(String[] args ) {
		// 문자열 단축키 : sysout + ctrl + spacebar
		System.out.println("객체 지향 프로그래밍");
	
		//주석 단축키 : crtl+/ (토글키)
//		System.out.println("객체");
//		System.out.println("지향");
		System.out.println("/*객체 지향*/ 프로그래밍");
		
		//숫자 출력 시 주의사항
		System.out.println(17+35);
		System.out.println("17 + 35  " + 17 + 35); //앞이 문자열이라 숫자도 문자열로 출력
		System.out.println("17 + 35  " + (17 + 35)); // 정수 먼저 계산
		
		//프린트 출력 포맷(printf)
		// % : 프린트 포맷 기호
		// %s : 문자열 
		// %d : 정수 
		// %f : 실수
		// %c : 문자
		// %b : boolean (true, false)
		// \n : 줄바
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d\n", 23);
		System.out.printf("과목 : %s %s %s \n","객체", "지향","프로그래밍"); // %s의 개수가 적다면 오류.
		
	}
}
