import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		
	 int[] diemToan = {9,8,1,7,4};
	 
	 int tong = 0;
	 Double diemTrungBinh ;
	 
	 //su dung for each 
	 for( int diem : diemToan) {
		 tong += diem;
	 }
	 
	 //tinh do dai của mảng 
	 int doDaiMang = diemToan.length;
	 
	 //tinh diem trung binh
	 
	 diemTrungBinh = ((double)tong / (double)doDaiMang);
	 
	 //in ra màn hình
	 System.out.println("Tong diem = " + tong);
	 System.out.println("Diem trung binh = " + diemTrungBinh);
	 
		
	}

}
