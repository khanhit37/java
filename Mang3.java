import java.util.Scanner;

public class Mang3 {
	public static void main(String[] args) {
		
		//Nhập độ dài của mảng
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang : ");
		int n = input.nextInt();
		
		//Nhập các phần tử của mảng với độ dài = n
		int[] soN;
		soN = new int[n];
		System.out.print("Nhap cac so phan tu cua mang : ");
		for( int i = 0; i < n; i++) {
		 soN[i] = input.nextInt();
		}
	    //liệt kê các phần tử trong mảng
	    System.out.print("Cac phan tu trong mang la : ");
	    for ( int phantu : soN) {
	    	System.out.print(phantu + ",");
	    }
	   
	    //Dung vòng lặp for lặp qua từ giá trị của soN và so sánh với soN[i] để tìm giá trị bé nhất
	    int Min = soN[0];
	    for(int i = 0; i < soN.length; i++) {
	    	if ( soN[i] < Min)
	    		Min = soN[i];
	    }
	    System.out.print("\n Gia tri nho nhat la : " + Min);
	    	
	    
	} 

}
