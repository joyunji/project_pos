package client;

public class CardPayment implements Payment{

	@Override
	public boolean pay(int price) {
		System.out.println("ī�� ������ Ȱ��ȭ");
		
		CardReader cr = new CardReader();
		
		int card_num = cr.read_card();
		System.out.println("<class CardPayment>ī�弭���� �����...");
		
		int limit = 1000000;
		if(limit >= price) {
			System.out.println("<class CardPayment>���� ���� ������ ����...");
			System.out.println("ī�� ��ȣ: " + card_num);
			return true;
		} else {
			System.out.println("<class CardPayment>���� ����...");
			return false;
		}
	}
}
