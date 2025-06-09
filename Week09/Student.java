
public class Student {
	String name;
	int korean;
	int english;
	int math;
	
	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.english = english;
		this.math = math;
	}
	
	int getTotal(int korean, int english, int math) 
	{
		int sum = 0;
		sum = korean + english + math;
		return sum;
	}
	
	double getAve(int total)
	{
		double result = 0;
		result = (double)total / 3;
		return result;
	}
}
