package client;

public class AssetManager {

	private int pay;
	private int kakao;
	private int cash;
	private int card;
	
	public AssetManager() {
		this.card = 1000;
		this.cash = 50;
		this.kakao =300;
	}
	
	public void stat() {
		System.out.println("<class AssetManager> 자산 통계");
		System.out.println("현금 : "+cash);
		System.out.println("카드사 : "+card);
		System.out.println("카카오페이 : "+kakao);
		System.out.println("--------------------");
		System.out.println("수입 : "+(cash + card + kakao));
		System.out.println("지출 : "+pay);
		System.out.println("====================");
		System.out.println("순이익 : "+(cash+card+kakao - pay));
	}
	
	public boolean payment(int cost) {
		if(cash >= cost) {
			cash -= cost;
			pay += cost;
			System.out.println("<class AssetManager> 지급 완료");
			return true;
		}else {
			System.out.println("<class AssetManager> 지급 실패");
			return false;
		}
	}
	
	public void earn(Payment p, int cost) {
		if(p instanceof CashPayment) {
			cash += cost;
		} else if(p instanceof CardPayment) {
			card += cost;
		} else if(p instanceof KakaoPayment) {
			kakao += cost;
		}
	}
}
