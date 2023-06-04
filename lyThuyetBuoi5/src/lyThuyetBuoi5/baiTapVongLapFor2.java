package lyThuyetBuoi5;

import java.util.Scanner;

public class baiTapVongLapFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, tong;
		tong = 0;
		
		System.out.println("Nhap so n: ");
		n = sc.nextInt();
		if (n <= 0)
		{
			System.out.println("Nhap sai du lieu!");
		}
		
		for (int i = 1; i <= n; i++)
		{
			if (i % 2 == 0)
			{
				tong += i;
			}
		}
		System.out.println("ket qua = " + tong);
	}

}
