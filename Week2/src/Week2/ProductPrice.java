package Week2;

public class ProductPrice {
	public static void main(String[] args) {
	
		int number = 7;
		int price = 5700;
		double result = (double)price / (double)number;
		
		// 상품단가 계싼 = 총구매금액 / 개
		
		System.out.printf("구매 수량 : %d개 \n",number);
		System.out.printf("총 구매 금액 : %d원 \n",price);
		System.out.printf("상품 단가 : %.1f원 \n", result);
		}
}
