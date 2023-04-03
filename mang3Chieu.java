import java.util.Scanner;

public class mang3Chieu {
	public static void main (String[] args) {
		
		int[][][]  mang3Chieu= {
				{
					{2,3,4},
					{3,4,3,5},
					{3},
				},
				{
					{1,2,3,4},
					{5,5},
				}
		};
		
		for( int[][] mang2Chieu : mang3Chieu) {
			for( int[] mangCon : mang2Chieu) {
				for( int giaTri : mangCon) {
					System.out.println("Gia tri : "  + giaTri);
				}
			}
		}
	}

}
