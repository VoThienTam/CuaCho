package baitap.tuan08;

public class CuaChoTestDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuaCho cua = new CuaCho();
		DieuKhien dk = new DieuKhien(cua);
		BarkRecognizer recognizer = new BarkRecognizer(cua);
		BarkManager bark = new BarkManager();
		//LUỒNG 9
		System.out.println("***** LUỒNG CHÍNH *****");
		System.out.println("Fido sủa để đi ra ngoài");
		bark.setAmThanh("Gâu Gâu");		
		recognizer.recognize(bark);
		System.out.println("Fido ra ngoài");
		System.out.println("Fido tác nghiệp");
		System.out.println("Fido đi vào nhà");
		cua.run();
		//LUỒNG THAY THẾ 1, 2.1, 3.1, 4, 5, 6.1, 6.2, 6.3.1, 6.4.1, 6.5, 7, 8
		System.out.println("***** LUỒNG THAY THẾ: 1, 2.1, 3.1, 4, 5, 6.1, 6.2, 6.3.1, 6.4.1, 6.5, 7, 8 ***** ");
		System.out.println("Fido sủa để đi vệ sinh");
		System.out.println("Todd or Gina nghe");
		dk.nhanNut();
		System.out.println("Fido ra ngoài");
		cua.run();
		System.out.println("Fido sủa để vào nhà");
		System.out.println("Todd or Gina nghe");
		dk.nhanNut();
		System.out.println("Fido đi vào nhà");
		cua.run();
		//LUỒNG THAY THẾ  1, 2.1, 3.1, 4, 5, 6, 7, 8
		System.out.println("***** LUỒNG THAY THẾ: 1, 2.1, 3.1, 4, 5, 6, 7, 8 *****");
		System.out.println("Fido sủa để đi vệ sinh");
		System.out.println("Todd or Gina nghe");
		dk.nhanNut();
		System.out.println("Fido ra ngoài");
		System.out.println("Fido tác nghiệp");
		System.out.println("Fido đi vào nhà");
		cua.run();
		//LUỒNG THAY THẾ  1, 2, 3, 4, 5, 6.1, 6.2, 6.3, 6.4, 6.5, 7, 8
		System.out.println("***** LUỒNG THAY THẾ: 1, 2, 3, 4, 5, 6.1, 6.2, 6.3, 6.4, 6.5, 7, 8 *****");
		System.out.println("Fido sủa để đi vệ sinh");
		bark.setAmThanh("Gâu Gâu");
		recognizer.recognize(bark);
		System.out.println("Fido ra ngoài"); 
		System.out.println("Fido tác nghiệp");
		cua.run();
		System.out.println("Fido sủa để vào nhà");
		recognizer.recognize(bark);
		System.out.println("Fido đi vào nhà");
		cua.wait5s();
		cua.run();	
		System.out.println("==================================================");
		System.out.println("Kết thúc\n Ngày mới tốt lành");
	}

}

