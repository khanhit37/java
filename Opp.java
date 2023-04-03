

class Den{
	
	//Biến thể hiện 
	private String denSang;
	
	//Phương thức bặt đèn
	public void batDen() {
		denSang = "Den dang bat";
	}
	
	// Phương thức tắt đèn 
	public void tatDen() {
		denSang = "Den dang tat";
	}
	
	public void thongBao() {
		System.out.println("Thong bao:" + denSang);
	}
}

class Opp{
	public static void main(String[] args) {
		
		//Tao đối tượng den1 từ class Den
		Den den1 = new Den();
		
		//bặt đèn
		den1.batDen();
		//Thông báo đổi trạng thái đèn
		den1.thongBao();
		
		//Tắt đèn
		den1.tatDen();
		//Thông báo đổi trạng thái
		den1.thongBao();
	}
}


	

