package client;

public class Main {

	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		
		pos.setPaymentMethod(new CardPayment());		
		pos.pay();
		System.out.println("--------------------------------------");
		pos.setPaymentMethod(new KakaoPayment());
		pos.pay();
		System.out.println("--------------------------------------");
		pos.setPaymentMethod(new CashPayment());
		pos.pay();

	}

}
