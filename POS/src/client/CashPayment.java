package client;

public class CashPayment implements Payment {

	
	private int received_price = 2000;
	@Override
	public boolean pay(int price) {
		if(received_price >= price) {
			int charge = received_price - price;
			System.out.println("�Ž�����: " + charge);
			return true;
		}else {
			System.out.println("���� �����մϴ�.");
			return false;
		}
	}
}
