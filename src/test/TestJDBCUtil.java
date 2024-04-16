
package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		
		try {
			// Bước 1: Tạo kết nối
			Connection connection = JDBCUtil.getConnection();
			
			// Bước 2: Tạo ra đối tượng statement
			Statement st = connection.createStatement();
			
			// Bước 3: Thực thi một câu lệnh SQL
			String sql = " INSERT INTO Experience (id, FullName, BirthDay, Phone, Email, Employee_type)"
					+ " VALUES ( \"123\", \"HoangVanDuc\", \"2005-29-0\", \"098888888\", \"duc@.com\", \"Fresher\")";
//					+ "( \"123\", \"HoangVanDuc\", \"2005-29-0\", \"098888888\", \"duc@.com\", \"Fresher\");"
//			String sql = "INSERT INTO persons(last_name, first_name, gender, dob, income)"
//					+ "VALUES (\"Tran\", \"Thi\", \"C\", \"2000-09-10\", 10000000)";
			
			int check = st.executeUpdate(sql);
			
			// Bước 4: xử lý kết quả 
			System.out.println("Số dòng thay đổi: "+ check);
			if(check>0) {
				System.out.println("Thêm dữ liệu thành công!");	
			}else {
				System.out.println("Thêm dữ liệu thất bại!");
			}
			
			// Bước 5: ngắt kết nối
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
