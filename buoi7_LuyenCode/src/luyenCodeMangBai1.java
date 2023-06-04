import java.util.Scanner;

public class luyenCodeMangBai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số phần tử có trong mảng: ");
		int n = sc.nextInt();
		
		System.out.println("Vui lòng nhập phần tử vào mảng: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.printf("a[%d] = " , i);
			arr[i] = sc.nextInt();	
		}
		
		System.out.print("Các chức năng: " 
		                 + "\n Số 1 : tính tổng số dương"
				         + "\n Số 2 : tính tổng các số lẻ"
		                 + "\n số 3 : đếm có bao nhiêu số dương"
				         + "\n số 4 : tìm số nhỏ nhất trong mảng"
		                 + "\n số 5 : tìm số dương nhỏ nhất trong mảng"
				         + "\n số 6 : tìm số chẵn trong mảng các số nguyên. Nếu mảng không có giá trị chẵn thì trả về -1"
		                 + "\n số 7 : tìm số chẵn đầu tiên trong mảng các số nguyên. Nếu mảng không có giá trị chẵn thì trả về -1"
				         + "\n số 8 : tìm số nguyên tố đầu tiên trong mảng 1 chiều các số nguyên. Nếu mảng không có số nguyên tố thì trả về -1"
		                 + "\n số 9 : tìm số dương cuối cùng có trong mảng số thực. Nếu mảng không có giá trị dương thì trả về -1"
				         + "\n số 10: tìm giá trị chẵn nhỏ nhất trong mảng 1 chiều các số nguyên. Nếu mảng không có số chẵn thì trả về -1");
		
		System.out.print("\nVui lòng chọn chức năng: ");
		int x = sc.nextInt();	
		switch (x) {
		case 1:
			System.out.println("Tính tổng số dương: ");
			int tongSoDuong = tongSoDuong(arr);
			System.out.println("Tổng số dương trong mảng = " + tongSoDuong);
			break;
		case 2:
			System.out.println("Tính tổng số lẻ: ");
			int tongSoLe = tongSoLe(arr);
			System.out.println("Tổng số lẻ trong mảng = " + tongSoLe);
			break;
		case 3:
			System.out.println("Đếm có bao nhiêu số dương trong mảng: ");
			int demSoDuong = demSoDuong(arr);
			System.out.printf("Mảng có %d số dương", demSoDuong);
			break;
		case 4:
			System.out.println("Tìm số nhỏ nhất trong mảng: ");
			int soNN = timSoNN(arr);
			System.out.println("Số nhỏ nhất trong mảng = " + soNN);
			break;
        case 5:
			System.out.println("Tìm số dương nhỏ nhất trong mảng: ");
			int soDuongNN = timSoDuongNN(arr);
			System.out.println("Số dương nhỏ nhất trong mảng: " + soDuongNN);
			break;
		case 6:
			System.out.println("Tìm số chẵn có trong mảng, nếu không có số chẵn trả về -1");
			int koCoSoChan = timSoChan2(arr);
			if(koCoSoChan == -1)
			{
				System.out.println("Mảng không có số chẵn, trả giá trị về " + koCoSoChan);
				return;
			}			
			
		    timSoChan(arr);
			break;
		case 7:
			timSoChanDauTien(arr);
			break;
		case 8:
			System.out.println("Tìm số nguyên tố nằm đầu tiên trong mảng: ");
			int soNT = timSoNT(arr);
			if (soNT == -1)
			{
				System.out.println("Không có nguyên tố nào, trả giá trị về = " + soNT);
				return;
			}
			
			System.out.printf("Số nguyên tố %d nằm đầu tiên trong mảng." , soNT);
			break;
        case 9:
			System.out.println("Tìm số dương cuối cùng có trong mảng: ");
			int soDuongCC = timSoDuongCC(arr);
			if (soDuongCC == -1)
			{
				System.out.println("Mảng không có số dương, trả giá trị về = " + soDuongCC );
				return;
			}
			System.out.println("Số dương cuối cùng = " + soDuongCC);
			break;
		case 10:
			System.out.println("Tìm giá trị chẵn nhỏ nhất: ");
			int soChanNN = timSoChanNN(arr);
			if (soChanNN == -1)
			{
				System.out.println("Mảng không có giá trị chẵn, trả giá trị về = " + soChanNN);
				return;
			}
			System.out.println("Số chẵn nhỏ nhất trong mảng = " + soChanNN);
			break;

		}
		
	}
	
	// 1
	public static int tongSoDuong(int[] arr)

	{
		int kq = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > 0)
			{
			kq += arr[i];
			}
		}
		
		return kq;
	}
	
	//2
	public static int tongSoLe(int[] arr)
	{
		int kq = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 != 0)
			{
				kq += arr[i];
			}
		}
		
		return kq;
	}
	
	//3
	public static int demSoDuong(int[] arr)
	{
		int kq = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > 0)
			{
				kq++;
			}
		}
		
		return kq;
	}
	
	//4
	public static int timSoNN(int[] arr)
	{
		int soNN = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (soNN > arr[i])
			{
				soNN = arr[i];
			}
		}
		
		return soNN;
	}
	
	//5
	public static int timSoDuongNN(int[] arr)
	{
		int soDuongNN = 0;
		// { 9 , 4, 6, 0 , 8}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				if (soDuongNN == 0)
				{
					soDuongNN = arr[i];
				}
				else if (soDuongNN > arr[i])
				{
					soDuongNN = arr[i];
				}
			}
		}
		
		return soDuongNN;
	}
	
	//6 
	public static void timSoChan(int[] arr)
	{
		System.out.println("Các số chẵn có trong mảng: ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}	
	public static int timSoChan2(int[] arr)
	{
		int koCoSoChan = -1;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				koCoSoChan = 2;
			}
		}
		
		return koCoSoChan;
	}
	
	//7
	public static void timSoChanDauTien(int[] arr)
	{
		System.out.println("Tìm số chẵn đầu tiên có trong mảng: ");
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				System.out.println("Số chẵn đầu tiên trong mảng: " + arr[i]);
				return;
			}
		}
		
		System.out.println("Mảng không có số chẵn, trả giá trị về = -1");
	}
	
	//8
	public static int timSoNT(int[] arr)
	{
		// { 6; 5; 7; 9; 1; 4}
		int soNT = -1;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > 1)
			{
				for (int j = 2; j < (arr[i] -1); j++)
				{
					if (arr[i] % j != 0)
					{
						soNT = arr[i];
					}
					else if (arr[i] % j == 0)
					{
						soNT = -1;
						break;
					}
				}
				if (soNT == arr[i])
				{
					return soNT;
				}
			}
		}
		
		return soNT;	
	}
	
	//9
	public static int timSoDuongCC(int[] arr)
	{
		// { -1, 4, 5, 7, 8, 6}
		int soDuongCC = -1;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > 0)
			{
				soDuongCC = arr[i];
			}
		}
		
		return soDuongCC;
	}
	
	//10
	public static int timSoChanNN(int[] arr)
	{
		// {12, 0, -3, -2; 8, 5, 9, 2}
		int soChanNN = -1;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 0)
			{
				if (soChanNN == -1)
				{
					soChanNN = arr[i];
				}
				else if (soChanNN > arr[i])
				{
					soChanNN = arr[i];
				} 
			}
		}
		
		return soChanNN;
	}
	
		

}
