import java.util.Scanner;

public class Car {
	int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		if(gas != 0) {
			System.out.println("gas가 있습니다.");
			return true;
		}
		else {
			return false;
		}
	}
	
	public void run() {
		System.out.println("출발합니다.");
		while(gas > 0) {
			System.out.println("달립니다.  (gas잔량:" + gas + ")");
			gas -= 1;
			Scanner sc = new Scanner(System.in);
			System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
			
			System.out.println("gas를 주입하세요 >> ");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			
		}
		
		
	}
}
