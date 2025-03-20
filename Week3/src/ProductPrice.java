
public class ProductPrice {

	public static void main(String[] args) {
		int milk = 4500;
		int car = 1000*3;
		int cok = 1500*2;
		
		int result = milk + car + cok;
		System.out.println("할인 전 상품 가격 : "+ result);
		
		double result2 = (milk*0.1) + (car*0.1) + (cok*0.1);
		System.out.println("할인 금액 : " + result2);
		
		double result3 = result - result2;
		System.out.println("최종 결제 금액 : "+result3 );

	}

}
