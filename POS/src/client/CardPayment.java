package client;

public class CardPayment implements Payment{

	@Override
	public boolean pay(int price) {
		System.out.println("카드 리더기 활성화");
		
		CardReader cr = new CardReader();
		
		int card_num = cr.read_card();
		System.out.println("<class CardPayment>카드서버와 통신중...");
		
		int limit = 1000000;
		if(limit >= price) {
			System.out.println("<class CardPayment>결제 정보 서버에 전송...");
			System.out.println("카드 번호: " + card_num);
			return true;
		} else {
			System.out.println("<class CardPayment>결제 실패...");
			return false;
		}
	}
}
