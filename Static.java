import java.util.Scanner;

public class Static {
	public static void main(String[] args) {
		
		//khai báo class thongbao
		 thongBao a = new thongBao();
		 vanBan2 text = new vanBan2();
		 
		System.out.println("Goi phuong phap thongBao ");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao 1 so: ");
		int n = input.nextInt();
		
	int	ketQua = tinhBinhPhuong(n);
		
		
		
		System.out.println("Binh phuong cua " + n + " la :" + ketQua);
		
		
		a.myMethod();
		
		text.vanBan2();
		
	}
	
	static int tinhBinhPhuong(int i) {
		return i * i;
	}

}

class thongBao {
	public void myMethod() {
		
		System.out.println("Hoan tat chuong trinh");
	}
}

class vanBan2 {
	public void vanBan2() {
	System.out.print("van ban 2");
}
}