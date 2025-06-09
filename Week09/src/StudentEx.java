
public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student("김용진", 100, 100, 100);
		
		int total = s1.getTotal(100,100,100);
		double avg = s1.getAve(total);
		
		System.out.printf("홍길동 : 총점 %d점, 평균 %.1f점", total, avg);
	}

}
