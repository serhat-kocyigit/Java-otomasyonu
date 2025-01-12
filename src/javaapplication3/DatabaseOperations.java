
package javaapplication3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DatabaseOperations {
    public void selectFromTable() {
        String query = "SELECT * FROM STOK WHERE Id = ?";

        try (Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/oto", "root", "S19b310?") ;
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, "some_value");
            ResultSet rs = pstmt.executeQuery();
            System.out.println("merhaba");
            while (rs.next()) {
                System.out.println(rs.getString("Id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseOperations operations = new DatabaseOperations();
        operations.selectFromTable();
    }
}

