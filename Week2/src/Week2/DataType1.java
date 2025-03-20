package Week2;

public class DataType1 {
	public static void main(String[] args) {
		//기본 데이터 타입
		// 직접 값을 주는 초기값 => 리터럴
		byte bData = 65;  //byte = 1byte
		char cData = 65;  //char = 2byte
		short sData = 65; //short = 2byte
		int iData = 65;   //int = 4byte
		long lData = 65;  //long = 8byte
		
		// 실수형
		float fData = 65.12f; //float = 4byte 리터럴값은 무조건 f를 붙인다.
        double dData = 65.12d; //double = 8byte 리터럴값 무조건 d.
        boolean boolData = true; //boolean = 1byte
        
        System.out.println("bData = "+ bData);
        System.out.println("cData = "+ cData);
        System.out.println("sData = "+ sData);
        System.out.println("iData = "+ iData);
        System.out.println("lData = "+ lData);
        System.out.println("fData = "+ fData);
        System.out.println("dData = "+ dData);
        System.out.println("boolData = "+ boolData);
	}
}
