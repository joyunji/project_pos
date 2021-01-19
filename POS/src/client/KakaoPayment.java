package client;

public class KakaoPayment implements Payment {

	@Override
	public boolean pay(int price) {
		System.out.println("바코드 스캔 start");
		
		BarcodeScanner bs = new BarcodeScanner();
		
		String barcode = bs.read_barcode();
		System.out.println("<class BarcodeScanner>바코드 스캔중...");
	
		if(bs.isContain(barcode)) {
			System.out.println("바코드: " + barcode);
			System.out.println("연결된 계좌로 자동이체...");
			System.out.println("<class KakaoPayment>결제 정보 서버에 전송...");
			return true;
		}else {
			System.out.println("<class KakaoPayment>결제 실패..");
			return false;
		}
		
	}//

}
