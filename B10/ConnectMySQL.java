package B10;

import java.sql.*;

public class ConnectMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/exercise";
        String user = "root";
        String password = "8739";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("=== Student's Data ===");

            // Xóa dữ liệu cũ nếu có
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("DELETE FROM Student_detail");
            stmt.executeUpdate("DELETE FROM Student");

            // Thêm dữ liệu vào bảng Student
            String insertStudent = "INSERT INTO Student(name, code) VALUES (?, ?)";
            PreparedStatement psStudent = connection.prepareStatement(insertStudent);

            String[][] studentList = {
                    {"Nguyen Van A", "S001"},
                    {"Tran Thi B", "S002"},
                    {"Le Van C", "S003"},
                    {"Pham Thi D", "S004"},
                    {"Nguyen Van E", "S005"},
                    {"Tran Thi F", "S006"},
                    {"Le Van G", "S007"},
                    {"Pham Thi H", "S008"},
                    {"Nguyen Van I", "S009"},
                    {"Tran Thi J", "S010"}
            };

            for (String[] s : studentList) {
                psStudent.setString(1, s[0]);
                psStudent.setString(2, s[1]);
                psStudent.addBatch();
            }
            psStudent.executeBatch();

            // Thêm dữ liệu vào bảng Student_detail
            String insertDetail = "INSERT INTO Student_detail(name, code, birthday, gender, email, phone, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psDetail = connection.prepareStatement(insertDetail);

            for (int i = 0; i < studentList.length; i++) {
                psDetail.setString(1, studentList[i][0]);
                psDetail.setString(2, studentList[i][1]);
                psDetail.setDate(3, Date.valueOf("2000-01-" + String.format("%02d", i + 1)));
                psDetail.setString(4, (i % 2 == 0) ? "Male" : "Female");
                psDetail.setString(5, "email" + (i + 1) + "@example.com");
                psDetail.setString(6, "0900000" + (i + 1));
                psDetail.setString(7, "Address" + (i + 1));
                psDetail.addBatch();
            }
            psDetail.executeBatch();

            connection.close();
            System.out.println("✅ Insert 10 dòng vào 2 bảng thành công!");

        } catch (SQLException e) {
            System.out.println("❌ Connect failed");
            e.printStackTrace();
        }
    }
}
