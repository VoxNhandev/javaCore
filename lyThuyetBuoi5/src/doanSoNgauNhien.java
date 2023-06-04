import java.util.Scanner;

public class doanSoNgauNhien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, soNgauNhien;
		
		while (true)
		{
		    soNgauNhien = (int) (Math.random()*(1000-1)+1);
		    System.out.println("-----------");
			System.out.println("Nhap mot so bat ky: ");
			n = sc.nextInt();
			System.out.println("So ngau nhien: " + soNgauNhien);
			if (n == soNgauNhien)
			{
				break;
			} 
			else if (n > soNgauNhien)
			{
				System.out.println("So ban doan lon hon so ngau nhien");
			}
			else if ( n < soNgauNhien)
			{
				System.out.println("So ban doan nho hon so ngau nhien");
			}
			
		}
		System.out.println("Ban da doan dung roi, xin chuc mung");
		
	}

}
