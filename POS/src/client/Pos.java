package client;

public abstract class Pos {
	private Payment payment;
	private int price = 1000;
	private AssetManager am = new AssetManager();
	
	public void pay() {
		if(payment.pay(price)) {
			System.out.println("결제 완료!!");
		}else {
			System.out.println("결제 실패...");
		}
	}
	
	public void setPaymentMethod(Payment payment) {
		this.payment = payment;
	}
	
	  public void assetStat() {
	    	am.stat();
	    }

}
