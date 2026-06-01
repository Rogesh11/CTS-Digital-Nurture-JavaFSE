
import java.sql.*;

public class Exercise32_InsertAndUpdateJDBC {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/studentdb";
		String user = "root";
		String password = "root";

		try {
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement insert =
					con.prepareStatement(
							"INSERT INTO students VALUES (?, ?)");

			insert.setInt(1, 104);
			insert.setString(2, "David");
			insert.executeUpdate();

			PreparedStatement update =
					con.prepareStatement(
							"UPDATE students SET name=? WHERE id=?");

			update.setString(1, "David Updated");
			update.setInt(2, 104);
			update.executeUpdate();

			System.out.println("Insert and Update Successful");

			con.close();

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/*
Sample Output:

Insert and Update Successful
*/
