package baitap.tuan08;

public class DieuKhien {
private CuaCho cua;// tham chiếu
	

	public CuaCho getCua() {
		return cua;
	}

	public void setCua(CuaCho cua) {
		this.cua = cua;
	}
	public DieuKhien() {
		
	}
	public DieuKhien(CuaCho cua) {
		this.cua = cua;
	}
	public void nhanNut() {
		
		System.out.println("Đang nhấn nút điều khiển....");
		if(cua.isTrangThai() == true) {//đang mở cửa
			cua.dongCua();
		}else {
			cua.moCua();
		}
	}


}