
public class lyThuyet {
	public static void main(String[] args) {
		
//		Ký hiệu của mảng : []
//		Khai báo một mảng có kiểu dữ liệu là int ( kiểu số )
//      Cú pháp : kiểu_dữ_liệu[] tên_biến = {}
//		item ( phân tử )
//		Lấy giá trị của mảng: tên_mảng[ vị trí muốn lấy giá trị ]
//		Gán giá trị cho phần tử bên trong trong mảng
//		Cú pháp: tên_mảng[vị trí] = giá trị mới
//		.length : Đây là hàm cho phép đếm độ dài của mảng ( đém xem mảng có bao nhiêu phần tử
		
		/**
		 *  null != ""
		 */
		
//		String chuoi;       //null : rỗng không tồn tại giá trị
//		String chuoi1 = ""  // ""  : rỗng nhưng có 1 giá trị
		
//		NullPointerException : Lỗi thường gặp 
		
		
		
		
//		int[] mangSo = {2, 10, 5, 8, 3};
//		
//		System.out.println("Chieu dai cua mang " + mangSo.length);
//		
//		for (int i = 0; i < mangSo.length; i++)
//		{
//			System.out.println("mảng: " + mangSo[2]);
//		}
//		
//		String [] mangChuoi = new String[8];
//		mangChuoi[0] = "Hellooo";
//		mangChuoi[1] = "BC02";
//		for (int i = 0; i < mangChuoi.length; i++)
//		{
//			System.out.println("Mang: " + mangChuoi[i]);
//		}
		
//		int[] mangSoMax = {32, 54, 23, 6, 7, 10, 4};
//		int max = mangSoMax[0];
//		
//		for (int i = 0; i < mangSoMax.length; i++) 
//		{
//			if (max < mangSoMax[i])
//			{
//				max = mangSoMax[i];
//				
//			}
//		}
		
//		tinhTong();
		}
	
//	 void : không có giá trị trả về : chỉ xử lý
//	Cú pháp : public static kiểu_dữ_liệu tên_hàm(tham số, tham số)
//	Gọi và sử dụng hàm : tên_hàm()	
//	Phím tắt đi vào kiểm tra code trong hàm : ctrl + click chuột trái
	
//	public static void tinhTong() 
//	{
//		int soA = 9;
//		int soB = 5;
//		int kq = soA + soB;
//		System.out.println("Tong la " + kq);
//	}
//	
	public static void TimSoLonNhat() 
	{
	
		int[] mangSoMax = {2, 3, 6, 6, 10, 7};
		int max = mangSoMax[0];
		int viTri = 0;
		
		for (int i = 0; i < mangSoMax.length; i++) 
		{
			if (max < mangSoMax[i])
			{
				max = mangSoMax[i];
				viTri = i;
				
			}
		}
		System.out.println("max " + max +"-- vi tri " + viTri);

	}
}
