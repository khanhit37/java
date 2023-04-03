import java.util.Scanner;

public class VongLap {
	public static void main(String[] args) {
		
		//tao doi tuong input
		Scanner input = new Scanner(System.in);
		
		//Xuat du lieu
		System.out.print("Nhap so nguyen : ");
		
		int soInput = input.nextInt();
		
		if(soInput > 0 && soInput < 100 ) {
			System.out.println(soInput + " la so duong");
		}else if(soInput >100 ) {
			System.out.println(soInput + " so lon hon 100");
		} else {
			System.out.println(soInput + " là so am");
		}
		

		
		
	}
}
