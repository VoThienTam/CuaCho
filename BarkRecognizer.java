package baitap.tuan08;


public class BarkRecognizer {
	private CuaCho cua;
	private String qlTiengSua = "Gâu Gâu";
	public BarkRecognizer(CuaCho cua) {
		this.cua = cua;
	}
	public void recognize(BarkManager bark) {
		System.out.println("BarkRecognizer: hear a ' " +bark.getAmThanh()+ " ' ");
		if(this.qlTiengSua.equals(bark.getAmThanh())) {
			cua.moCua();
		}else {
			System.out.println("Cửa chó không mở");
		}
		
	}

}

