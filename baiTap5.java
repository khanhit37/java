import java.util.Scanner;
import  java.util.regex.Pattern;

public class baiTap5 {
	public static void main(String[] args) {
		
		String MSSV;
		System.out.println("Nhap ma so sinh vien: " );
		
		Scanner input = new Scanner(System.in);
		
		MSSV = input.nextLine();
		
		if(MSSV.matches("B\\d{7}"))
			System.out.println("MS phu hop");
		else 
			System.out.println("Khong phu hop");
		
		
	}

}
