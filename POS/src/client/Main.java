package client;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1: ī��, 2: īī������ 3: ����");
		System.out.println("���� ����� �����Ͻÿ�(���� �Է�):");
		int paymentMethod = sc.nextInt();
		
		switch(paymentMethod) {
		case 1:
			pos.setPaymentMethod(new CardPayment());
			break;			
		case 2:
			pos.setPaymentMethod(new CashPayment());
			break;
		case 3:
			pos.setPaymentMethod(new KakaoPayment());
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			continue;
		}
		pos.pay();sc.close();
		break;
		}
		pos.assetStat();
		
	}


}
