package client;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pos pos = new BookstorePos();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("1: 카드, 2: 카카오페이 3: 현금");
		System.out.println("결제 방법을 선택하시오(숫자 입력):");
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
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}
		pos.pay();sc.close();
		break;
		}
		pos.assetStat();
		
	}


}
