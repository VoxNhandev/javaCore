package luyenCodeOOP;

import java.util.ArrayList;

public class TongLyThuyetOOP {
	public static void main(String[] args) {
//			ChuyenXeNoiThanh xe = new ChuyenXeNoiThanh("C001", "Nguyen Van A", "51-3A3213", 100000,"01",3);
//			ChuyenXeNgoaiThanh xe1 = new ChuyenXeNgoaiThanh("A114", "Nguyen Van B", "51-1A11111", 200000, "Nha Trang", 2);
			
//	   sử dụng trừu tượng, để khởi tạo thằng cha dùng tính đa hình :
//			CacChuyenXe xe = new ChuyenXeNoiThanh("C001", "Nguyen Van A", "51-3A3213", 100000,"01",3);
//			ChuyenXeNoiThanh xeNoiThanh = (ChuyenXeNoiThanh) xe; (kieu_du_lieu) ten_bien : ép kiểu
			
//			featurexe fxe = new ChuyenXeNoiThanh("C001", "Nguyen Van A", "51-3A3213", 100000,"01",3); //interface : có nội tại ẩn nên khi khai báo ra class cha feature
//			fxe.tinhTongDoanhThu();                                                                  // sẽ có tất cả các giá trị của class con mà không cần ép kiểu
			
		
//	    1) đóng gói: public, private, protected
		
//	    2) kế thừa :sẽ kế thừa toàn bộ thuộc tính và phương thức của class cha
//		**extends : kế thừa được 1 class  ; interface : kế thừa được nhiều class
//		
//	    3) đa hình : từ class cha có thể khởi tạo ra class con( sau khi khởi tạo ép kiểu dữ liệu --> class cha sẽ có tất cả các giá trị của class con )
		
//	    4) trừu tượng: chỉ giành để kế thừa, không thể khởi tạo được (nếu muốn khởi tạo phải dùng tình đa hình)
//		**astract class: thì chỉ kế thừa được 1 lần thông extends

//		Override (ghi đè)    : gọi hàm thuộc đối tượng class cha, và thay đổi logic code của function gọi ra ( ghi đè )
//		Overload (nạp chồng) : trùng tên hàm nhưng khác nhau về số lượng tham số hoặc kiểu dữ liệu.
//      abstract  : chỉ giành cho kế thừa và một class chỉ được kế thừa 1 lần
//      interface : chỉ để giành khai báo phương thức (hàm). không có thực hiện logic code
			
//		super   : đại diện cho hàm cha
//		super() : đại diện cho hàm cha rỗng
		
		
		ChuyenXeNoiThanh xe = new ChuyenXeNoiThanh("C001", "Nguyen Van A", "51-3A3213", 100000,"01",3);
     	ChuyenXeNoiThanh xe1 = new ChuyenXeNoiThanh("A114", "Nguyen Van B", "51-1A11111", 200000, "Nha Trang", 2);
		
		
//		tạo ra danh sách (list) rỗng có giá trị của các phần tử thêm vào là ChuyenXeNoiThanh
		ArrayList<ChuyenXeNoiThanh> list = new ArrayList<ChuyenXeNoiThanh>();
		
		
//		thêm phần tử  vào danh sách (list)
		list.add(xe);
		list.add(xe1);
		
//		xóa phần tử ở vị trị số 0 trong list
		list.remove(0);
		
//		list.size() : đếm xem có bao nhiêu phần tử nằm bên trong 
		for (int i = 0; i < list.size(); i++) 
		{
			ChuyenXeNoiThanh item = list.get(i); // lấy ra giá trị của phần tử có vị trí chỉ định
			System.out.println(item.getHoTenTaiXe());
		}
		
//		for loop: ưu điểm tự nhận dạng kiểu dữ liệu class
//		foreach : không tự nhận dạng kiểu dữ liệu, muốn phân loại sử dụng instanceof
		
//		contains : tìm gần đúng chỉ chuỗi "so sánh" có tồn tại trong mảng là đúng.
//	    instanceof : dùng để kiểm tra phương thức khởi tạo của biến là gì	
//	    
//		Object : Có thể là bất cứ dữ liệu nào
//		Lưu ý : Khi thực hiện xóa dữ liệu của list thì tránh xử dụng for có index vì 
//	kích thước của list sẽ đổi dẫn tới lỗi Outbound ( vượt quá giới hạn của mảng ) 	
		
		
		
	}

}
