
public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동", 6.1);
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(p1.height * Person.FEET_CONSTANT + "cm");

		// fianl로 정의된 필드는 한 번 초기화 후 값을 변경하지 못한다.
	}

}
