package lyThuyetBuoi4;

import java.util.Scanner;

public class lyThuyet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Khi có được yêu cầu thì phải xác định được các bước sau
		 * 
		 * 1) Phải xác định được giá trị đầu vào ( cho người dùng nhập cái gì ).
		 * 2) Cần xử lý gì dựa trên yêu cầu của KH ( tức là xử lý các giá trị người dùng nhập vào ở bước 1).
		 * 3) Xác định kết quả trả ra cho KH.
		 * 
		 */
		
		 /**
		  * Trong if()
		  * - so sánh chuỗi thì xài : equal
		  * - so sánh số thì xài : ==  
		  * - để phủ định lại điều kiện if: !, !true => false, !false => true
		  */
//		if(conVat.equals("Cho")) {
//			// thỏa điều kiện
//		}
//		
		
		
		
		String hoTen, gioiTinh, maSoSV;
		int tuoi;
		
		System.out.println("Vui lòng nhập họ và tên sinh viên: ");
		hoTen = sc.nextLine();
		
		System.out.println("Vui lòng nhập số tuổi: ");
		tuoi = sc.nextInt();
		sc.nextLine();   // đối với kiểu số nextInt xong phải có dòng nextLine để xuống dòng console
		
		System.out.println("Vui lòng nhập giới tính: ");
		gioiTinh = sc.nextLine();
		
		System.out.println("Vui lòng nhập mã số sinh viên: ");
		maSoSV = sc.nextLine();
		

	}

}
