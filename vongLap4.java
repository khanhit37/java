import java.util.Scanner;

public class vongLap4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen < 20 : ");
		
		int a = 0;
		int i = input.nextInt();
		
		for ( i = 0; i <= 20 ; ++i ) {
			a += i;
			System.out.println(a);
				
			}
			
			
		}
		
	}


