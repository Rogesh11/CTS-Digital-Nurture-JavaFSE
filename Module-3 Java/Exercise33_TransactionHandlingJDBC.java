import java.sql.*;

public class Exercise33_TransactionHandlingJDBC {

    public static void main(String[] args) {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank",
                    "root",
                    "root");

            con.setAutoCommit(false);

            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                    "UPDATE accounts SET balance = balance - 500 WHERE id = 1");

            stmt.executeUpdate(
                    "UPDATE accounts SET balance = balance + 500 WHERE id = 2");

            con.commit();

            System.out.println("Transaction Successful");

        } catch (Exception e) {

            try {
                if (con != null)
                    con.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Transaction Rolled Back");
        }
    }
}
/*
Sample Output:

Transaction Successful
*/

