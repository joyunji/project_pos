package client;

public class CashPayment implements Payment {

	
	private int received_price = 2000;
	@Override
	public boolean pay(int goods_price) {
		if(received_price > goods_price) {
			int charge = received_price - goods_price;
			System.out.println("°Å½º¸§µ·: " + charge);
			return true;
		}else if(received_price == goods_price) {
			return true;
			
		}else {
			return false;
		}
	}
}
