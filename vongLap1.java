import java.util.Scanner;

public class vongLap1 {
	public static void main(String[] args) {
		
		
		//Nhap du lieu
		Scanner input = new Scanner(System.in);
		
		
		int tong = 0;		
		int soNguyenDuong = 0;
		
		System.out.println("Nhap vao 1 so nguyen duong");
		
		do {
			
			soNguyenDuong = input.nextInt();
			if(soNguyenDuong >0 && soNguyenDuong % 2 ==0 ) {
				tong += soNguyenDuong;
			}
			
		 // Tinh tong khi nhap vao so -1 
		} while ( soNguyenDuong > 0 );
		    System.out.println("Tong = " + tong);
		
		
		
	}

}
