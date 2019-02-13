import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbAccess {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/sakila?user=root&&password=root");
			
			
			Statement st=conn.createStatement();
			ResultSet rst=st.executeQuery("select * from actor limit 20");
			
			while(rst.next()) {
				
				System.out.println("nome attore -->"+rst.getString("first_name"));
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
