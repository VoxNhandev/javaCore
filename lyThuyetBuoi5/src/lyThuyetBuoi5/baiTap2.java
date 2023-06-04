package lyThuyetBuoi5;

import java.util.Scanner;

public class baiTap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		cách 1:
		
//		int soNhap, tong;
//		tong = 0;
//		soNhap = 1;
//		
////		khi soNhap mà còn lớn hơn 0 thì thỏa điều kiện while
//		while (soNhap > 0)
//		{
//			System.out.println("Nguoi dung nhap vao: ");
//			soNhap = sc.nextInt();
//			
//			if (soNhap > 0 )
//			{
//			tong += soNhap;
//			}
//		}
//		System.out.println("ket qua: " + tong);
		
//		cách 2: 
		
		int soA = 1;
		int tong = 0;
//		đệ quy ( kiến thức quan trọng cần tìm hiểu )
		while (true)
		{
			System.out.println("Vui lòng nhập số: ");
			soA = sc.nextInt();
			if (soA <= 0)
			{
				break;
			}
			else if (soA > 0)
			{
				tong += soA;
			}		
		}
		System.out.println("Kết quả = " + tong);
		
	}

}
