import java.util.Scanner;

public class vongLap2 {
	public static void main(String[] args) {
		
		int soNguyen = 0 ; 
		int ketQua ;
		
		
		//Nhap du lieu
		Scanner input =  new Scanner(System.in);
		
		
		System.out.println("Nhap vao so nguyen : ");
		soNguyen = input.nextInt();
		for (int i = 1; i <= 20; ++i) {
			ketQua =  soNguyen * i ;
			System.out.println("Tich cua " + soNguyen + " la : " + ketQua);
		
			
			}
	}

}
