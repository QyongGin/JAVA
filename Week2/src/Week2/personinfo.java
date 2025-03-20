package Week2;

public class personinfo {
	
	public static void main(String[] args) {
		
		String name = "김용진";
		int age = 23;
		double cent = 160;
		char sexual = 'M';
		Boolean student = true;
		
		System.out.println("이름 : "+name);	
		System.out.println("나이 : "+age);
		System.out.printf("키 : %.1fcm \n",cent);
		System.out.printf("성별 : %c \n",sexual);
		System.out.printf("학생 여부 : %b \n",student);
	

		
	}
}
