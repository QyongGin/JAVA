
public class Person {

	static final double FEET_CONSTANT = 30.48; // 불변 공용 데이터로 사용
	
	final String nation = "korea"; // final -> 초기값 변경 불가
	final String ssn; // 생성자로 초기값 생성
	String name;
	double height;
	
	public Person(String ssn, String name, double height) {
		this.ssn = ssn; // 이제 변경 불가
		this.name = name;
		this.height = height;
	}
}
