package Week2;

public class Casting {
	public static void main(String[] args) {
		//강제 타입 변환
		int iData = 65;
		char cData = (char)iData; // 큰 데이터는 작은 타입에 들어오지 못하지만, ()로 타입을 지정하면 된다.
		System.out.println(cData);
		
		long lData = 500;
		iData = (int)lData; //마찬가지다. long은 int보다 데이터 타입이 크기 때문에 int로 강제로 작게 저장한다.
		System.out.println(iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.println(iData);
		
		// casting 하기 전에 데이터 손실 여부 확인
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE)
		{
			bValue = (byte)iValue; //casting 가능 범위
		}
		else
		{
			System.out.println("casting 범위를 벗어납니다.");
		}
	}
}
