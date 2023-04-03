import java.util.Scanner;

public class Mang2 {
	public static void main(String[] args) {
		
		int[] soN;
		
		
		//Nhap độ dài của mảng
		 Scanner input = new Scanner(System.in);
		 System.out.print("Nhap vao so phan tu cua mang : ");
		 // n là độ dài của mảng
		 int n = input.nextInt();
		 
		 //soN là số các phần tử của mảng
		 soN = new int[n];
		 System.out.print("Nhap vao so cac phan tu cua mang : ");
		 for( int i = 0; i < n  ; i++ ) {
			 soN[i] = input.nextInt();
		 }
		 
		 //liệt kê các phần tử trong mảng
		 System.out.print("Cac phan tu trong mang la : ");
		 for(int i = 0 ; i < soN.length ; i++) {
			 int phantu = soN[i];
			 System.out.print(phantu + ",");
			 
			 /*sử dụng for-each
			 for(int phantu : soN)
				 System.out.print(phantu + ","); */
		 }
		 // sử dụng vòng lặp for lặp từ phần từ đầu tiên đến phần tử cuối cùng
		 // nếu soMax lớn hơn Max thì trở thành max và lặp hết độ dài của chuỗi
		 
		 
		 int max = soN[0];
		 for( int soMax : soN) {
			 
			 if (max < soMax)
				 max = soMax;
			 
			 
		 }
		 System.out.print(" \n So lon nhat la so : " + max);
	}

}
