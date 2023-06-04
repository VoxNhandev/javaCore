package cauTrucDieuKien_Buoi3;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {

//		int soA = 3;
//		int soB = 4;
//		int soC = 8;
//		
//		if (soA > soB) {
//			// logic code thỏa điều kiện if
//			System.out.println("So A lon hon so B");
//		} else {
//			// Ngược lại không thỏa điều kiện if
//			System.out.println("So A nho hon so B");
//			return; // dừng code ngay tại đây
//		}
//		System.out.println("Ket thuc if");
//		
//		
//		Scanner sc = new Scanner(System.in);
//
//		double toan, ly, anh, diemTB;
//
//		System.out.println("Nhap diem thi toan: ");
//		toan = sc.nextDouble();
//		System.out.println("Nhap diem thi ly: ");
//		ly = sc.nextDouble();
//		System.out.println("Nhap diem thi anh: ");
//		anh = sc.nextDouble();
//
//		diemTB = ((toan * 2) + ly + anh) / 4;
//
//		if (toan <= 10 && toan >= 0 && ly >= 0 && ly <= 10 && anh >= 0 && anh <= 10) {
//
//			if (diemTB >= 9) {
//				System.out.println("Hoc sinh gioi");
//			} else if (diemTB >= 8 && diemTB < 9) {
//				System.out.println("Hoc sinh kha");
//			} else if (diemTB >= 7 && diemTB < 8) {
//				System.out.println("Hoc sinh tien tien");
//			} else if (diemTB >= 5 && diemTB < 7) {
//				System.out.println("Hoc sinh trung binh");
//			} else {
//				System.out.println("hoc sinh yeu");
//			}
//
//		} else {
//			System.out.println("Nhap loi!!");
//		}
		
		int soBanChon = 3;
		switch (soBanChon) {
		case 1:
			System.out.println("So 1");
			break;
		case 2:
			System.out.println("So 2");
			break;
		case 3: 
			System.out.println("So 3");
			break;

		default:
			System.out.println("So nay sai roi!!");
			break;
			
		}

	}

}
