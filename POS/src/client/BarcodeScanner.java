package client;

public class BarcodeScanner {
	
	private String barcode;
	private String[] barcodes = {"12345678","1211212","2212212"};
	
	public BarcodeScanner() {
		this.barcode = "12345678";
	}
	
	public String read_barcode() {
		return barcode;
	}
	
	public boolean isContain(String barcode) {
		for(int i=0;i<barcodes.length;i++) {
			if(barcodes[i].equals(barcode)) {
				break;
			}
			if(i == barcode.length()-1) {
				return false;
			}
		}//for
		return true;
	}
	
	
}
