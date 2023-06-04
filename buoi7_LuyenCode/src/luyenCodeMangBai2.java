import java.util.Scanner;

public class luyenCodeMangBai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tìm giá trị và vị trí trong mảng số thực 'xa giá trị x nhất', x được nhập từ người dùng: ");
		int[] arr = {24, 45, 23, 13, 43, -12 };
		
		System.out.print("Người dùng vui lòng nhập x: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) 
		{
			int xuatKhoangCach = Math.abs(arr[i] - x); 
			System.out.printf("a[%d] = ", i );
			System.out.println(xuatKhoangCach);
		}
		
		int khoangCach = arr[0] - x;
		int phanTu = arr[0];
		int viTri = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(khoangCach < (arr[i]-x))
			{
				khoangCach = Math.abs(arr[i] - x);
				phanTu = arr[i];
				viTri = i;
			}
			
		}
		
		System.out.printf("Giá trị trong mảng xa nhất là %d ", phanTu);
		System.out.printf("Tại vị trí thứ %d ", viTri);		
	}

}
