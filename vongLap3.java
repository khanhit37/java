import java.util.Scanner;

public class vongLap3 {
	public static void main(String[] args) {
		
		boolean soNguyenTo = false;
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("Nhap vao 1 so nguyen be hon 1000: ");
		 
		 int a = input.nextInt();
		 
		 System.out.print("1 2 ");	 
		 //1,2 là số nguyên tố mặc nhiên ,k cần xét
		 for (int i = 3; i <= a ; i++) {
			 soNguyenTo = true;
			 
			 for (int j = 2; j < i; j++) {
				 if (i % j == 0)
					 soNguyenTo = false;
			 }
			 if ( soNguyenTo == true)
				 System.out.print(i + "");
		 }
	}

}
