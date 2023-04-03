import java.util.Scanner;

public class Mang1 {
	public static void main(String[] args) {
		
		int[] soN;
		int diemTrungBinh;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang : ");
		//n la độ dài cua mảng
		int n = input.nextInt();
		
		//soN là số phần tử của mảng
		soN = new int[n];
		System.out.print("Nhap vao cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
			soN[i] = input.nextInt();
		}
		// tính tổng của mảng soN
		int tong = 0;
		for(int i = 0; i < n; i++) {
			tong += soN[i];
		}
		
		diemTrungBinh = tong / n;
		
		System.out.print("Diem trung binh =" + diemTrungBinh);
	}

}
