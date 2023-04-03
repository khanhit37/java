import java.util.Scanner;


public class baiTap4 {
	public static void main(String[] args) {
		
		//Nhap du lieu
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao 3 so thuc : ");
		
		//Khai bao input
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		// Math.pow(A,2) + Math.pow(B,2) != Math.pow(C,2)
		
		if (A*A + B*B == C*C || A*A + C*C == B*B || C*C + B*B == A*A ) {
			System.out.println("A B C  la 3 canh cua tam giac vuong");
		} else {
			System.out.println("A B C khong phai la 3 canh cua tam giac vuong");
		}
	}

}
