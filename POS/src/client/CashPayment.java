package client;

public class CashPayment implements Payment {

	
	private int received_price = 2000;
	@Override
	public boolean pay(int price) {
		if(received_price >= price) {
			int charge = received_price - price;
			System.out.println("거스름돈: " + charge);
			return true;
		}else {
			System.out.println("돈이 부족합니다.");
			return false;
		}
	}
}
