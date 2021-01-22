package client;

public abstract class Pos {
	private Payment payment;
	private int price = 1000;
	private AssetManager am = new AssetManager();
	
	public void pay() {
		if(payment.pay(price)) {
			System.out.println("���� �Ϸ�!!");
		}else {
			System.out.println("���� ����...");
		}
	}
	
	public void setPaymentMethod(Payment payment) {
		this.payment = payment;
	}
	
	  public void assetStat() {
	    	am.stat();
	    }

}
