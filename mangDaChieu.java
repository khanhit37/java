import java.util.Scanner;

public class mangDaChieu {
	public static void main(String[] args) {
		
		int[][] a = {
				{2,3,4},
				{3,4,3,5},
				{3},
		};
		
		//lặp qua mảng và in ra các phần tử
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[i].length; ++j) {
				System.out.println("Phan tu a[" + i + "]"  +"[" +j + "] la: " + a[i][j] );
			}
		}
	}

}
