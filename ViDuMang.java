

public class ViDuMang {
	public static void main(String[] args) {
		int[] diemToan = {1,2,3,4,5,6};
		
		//copy mang su dung toan tu gan
		int[] diemToan1 = diemToan;
		
		//thay doi phần tử trong mảng diemToan
		
		diemToan[0] = 10;
		
		System.out.print("Mang diemToan1 : ");
		
		//in tat cả các mảng của diemToan1 
		for( int diem : diemToan1) {
			System.out.print(diem + ",");
		}
		
		//thay đổi phần tử trong diemToan1
		diemToan1[2] = 10;
		
		System.out.print('\n' + "Mang diemToan");
		
		for( int i = 0; i < diemToan.length; i++  ) {
			int diem = diemToan[i];
			System.out.print(diem + ",");
		}
		
	}

}
