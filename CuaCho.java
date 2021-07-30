package baitap.tuan08;

public class CuaCho implements Runnable {
	private boolean trangThai;
	private String qlTiengSua;

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
	public String getChoPhepSua() {
		return qlTiengSua;
	}

	public void setChoPhepSua(String choPhepSua) {
		this.qlTiengSua = choPhepSua;
	}

	public CuaCho() {
		this.trangThai = false;//đóng
	}
	public void moCua() {
		System.out.println("Mở cửa");
		this.trangThai = true;
	}
	public void dongCua() {
		System.out.println("Đóng cửa");
		this.trangThai = false;
	}
	public void wait5s(){
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Sau 5 giây");

		try {
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException e) {
			e.getStackTrace();
		}
		if(this.isTrangThai()) {
			this.setTrangThai(false);
			this.dongCua();
		}
	}
		
}
