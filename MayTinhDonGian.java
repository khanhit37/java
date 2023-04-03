
import java.util.Scanner;

public class MayTinhDonGian {
	public static void main(String[] args) {
		
		char phepTinh;
		int so1,so2, ketQua;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chon phep tinh : + va -");
		
		phepTinh = scanner.next().charAt(0);
		System.out.println("Nhap 2 so: ");
		
		so1 = scanner.nextInt();
		so2 = scanner.nextInt();
		
		switch(phepTinh){
		case '+' :
			ketQua = so1 + so2;
			System.out.println(so1 + "+" + so2 + "=" + ketQua);
			break;
		
		case '-' :
			ketQua = so1 - so2;
			System.out.println(so1 + "-" + so2 + "=" + ketQua);
			break;
		default:
			System.out.println("error");
			break;
		}
	}

}
