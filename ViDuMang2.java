import java.util.Arrays;

public class ViDuMang2 {
	public static void main(String[] args) {
		
		int[][] mangNguon = {
				{2,3,4},
				{3,4,3,5},
				{3},
				{1,2,3},
		};
		
		int[][] mangDich = new int[mangNguon.length][];
		
		for(int i = 0; i < mangDich.length; ++i) {
			
			//phân bố k gian cho mỗi hàng của mảng đích
			mangDich[i] = new int[mangNguon[i].length];
			
			for(int j = 0; j < mangDich[i].length; ++j) {
				mangDich[i][j] = mangNguon[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(mangDich));
		
	}
}
	/*
	public static void main2(String[] args) {
		
        int[] a1 = {1,2,3,4,5,6};
		
		
		
		//tạo mảng a2 có độ dài bằng a1
		int[] a2 = new int[a1.length];
		
		//sao chép mảng a1 sang mảng a2 
		System.arraycopy(a1, 0, a2, 0, 6);
		
		System.out.println("Mang a2 = " + Arrays.toString(a2));
		
		//sao chep sang a3
		
		int[] a3 = Arrays.copyOfRange(a1, 2, 5);
		System.out.print("Mang a3 =" + Arrays.toString(a3));
	}

}
 */

