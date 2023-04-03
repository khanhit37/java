import java.util.Scanner;

public class baiTap3 {
	public static void main (String[] args) {
		
		//Nhap du lieu
		Scanner input =  new Scanner(System.in);
		System.out.println("Nhap vao 3 so thuc: ");
		
		//Khai bao input
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		if (A + B > C) {
			System.out.println("ABC la 3 canh cua 1 tam giac");
		} else if ( A + C > B) {
			System.out.println("ABC la 3 canh cua 1 tam giac");
		} else if ( B + C > A) {
			System.out.println("ABC la 3 canh cua 1 tam giac");
		} else {
			System.out.println("ABC khong phai la 3 canh cua 1 tam giac");
		}
	}

}
