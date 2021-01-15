package client;

public class Main {

	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		pos.setPaymentMethod(new CardPayment());
		pos.pay();

	}

}
