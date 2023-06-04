import java.util.Scanner;

public class luyenCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số phần tử trong mảng: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Nhập phần tử vào mảng: ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Vui lòng chọn chức năng: "
				           + "\n số 1 : viết hàm nhập và hàm xuất"
				           + "\n số 2 : tìm số lớn nhất và vị trí của nó trong mảng"
				           + "\n số 3 : tìm số âm lớn nhất và vị trí của nó trong mảng"
				           + "\n số 4 : tính tổng các số chẵn"
				           + "\n số 5 : đếm có bao nhiêu số âm"
				           + "\n số 6 : tổng các số âm"
				           + "\n số 7 : cho người dùng nhập x và tìm x có trong mảng đó hay không");
		System.out.print("Vui lòng chọn chức năng: ");
		int x = sc.nextInt();
		                       
		switch (x) {
		case 1:
			show(arr);
			break;
		case 2:
			timSoLonNhat(arr);
			break;
		case 3:
			System.out.println("Tìm số âm lớn nhất và vị trí của nó trong mảng: ");
			
			boolean koCoSoAm = koCoSoAm(arr);
			if (koCoSoAm == false)
			{
				System.out.println("Mảng không có số âm!");
				return;
			}
			timSoAmLonNhat(arr);
			
			break;
		case 4:
			System.out.println("Tính tổng các số chẵn: ");
			int tongCacSoChan = tongCacSoChan(arr);
			System.out.println( "Tổng = " + tongCacSoChan);
			break;
        case 5:
			System.out.println("Đếm có bao nhiêu số âm: ");
			int demSoAm = demSoAm(arr);
			System.out.printf("Mảng có %d số âm", demSoAm);
			break;
		case 6:
			System.out.println("Tổng các số âm: ");
			int tongSoAm = tongCacSoAm(arr);
			System.out.println("Tổng = " + tongSoAm);
			break;
		case 7:
			timX(arr);
			break;
		}
	
	}
	
	public static void show(int[] arr)
	{
		System.out.println("Xuất số phần tử có trong mảng: ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void timSoLonNhat(int[] arr)
	{
		int max = arr[0];
		int viTri = 0;
		
		System.out.println("Số lớn nhất và vị trí của nó trong mảng: ");
		for (int i = 0; i < arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
				viTri = i;
			}
		}
		
		System.out.println("Max = " + max + " - location = " + viTri);
	}
	
	public static void timSoAmLonNhat(int[] arr)
	{
		int soAm = 0;
		int viTri = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 0)
			{
				if (soAm == 0)
				{
					soAm = arr[i];
					viTri = i;
				}
				else if (soAm < arr[i])
				{
					soAm = arr[i];
					viTri = i;
				}
			}
		}
		
		System.out.println("Số âm lớn nhất: " + soAm + " - Vị trí: " + viTri);
	}
	
	public static boolean koCoSoAm(int[] arr) 
	{
		boolean koCoSoAm = false;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 0)
			{
				koCoSoAm = true;
			}
		}
		
		return koCoSoAm;
	}
	
	public static int tongCacSoChan(int[] arr)
	{
		int tong = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				tong += arr[i];
			}
		}
		
		return tong;
	}
	
	public static int demSoAm(int[] arr)
	{
		int soAm = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < 0)
			{
				soAm++;
			}
		}
		return soAm;
	}
	
	public static int tongCacSoAm(int[] arr)
	{
		int tongSoAm = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < 0)
			{
				tongSoAm += arr[i];
			}
		}
		
		return tongSoAm;
	}
	
	public static void timX(int[] arr)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Người dùng nhập x và tìm x có trong mảng không: ");
		
		System.out.println("Người dùng vui lòng nhập x: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (x == arr[i])
			{
				System.out.printf("Người dùng nhập x = %d có trong mảng" , arr[i] );
				return;
			}
		}
		
		System.out.println("Người dùng nhập x không có trong mảng");
		
	}
	
	

}
