package client;

public class KakaoPayment implements Payment {

	@Override
	public boolean pay(int price) {
		System.out.println("���ڵ� ��ĵ start");
		
		BarcodeScanner bs = new BarcodeScanner();
		
		String barcode = bs.read_barcode();
		System.out.println("<class BarcodeScanner>���ڵ� ��ĵ��...");
	
		if(bs.isContain(barcode)) {
			System.out.println("���ڵ�: " + barcode);
			System.out.println("����� ���·� �ڵ���ü...");
			System.out.println("<class KakaoPayment>���� ���� ������ ����...");
			return true;
		}else {
			System.out.println("<class KakaoPayment>���� ����..");
			return false;
		}
		
	}//

}
