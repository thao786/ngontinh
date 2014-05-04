package test;

import java.sql.Connection;


public class JDBCExample {
 
	public static void main(String[] argv) {

		try { 
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return; 
		}
 
		System.out.println("PostgreSQL JDBC Driver Registered!");
 
		Connection connection = null;
 
		try { 
		//	connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/truyen", "postgres","fall2010");
			connection = DriverManager.getConnection("jdbc:postgresql://23.239.1.206:5432/ngontinh", "postgres","fall2010");
		} catch (SQLException e) { 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return; 
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		
		
		
		
		try {
//			String selectTableSQL = "SELECT name, author from truyen where author='haha'";
//			Statement statement = connection.createStatement();
//			ResultSet rs = statement.executeQuery(selectTableSQL);
//			
//			while (rs.next()) {
//				String userid = rs.getString("name");
//				String username = rs.getString("author");	
//				
//				System.out.println(userid);
//				System.out.println(username);
//			}
			
			
			
//			String insertTableSQL = 
//					"INSERT INTO truyen (title, alternate, path, author, state, chap, genre,source, editor, translator, date_Added"
//					+ ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//			
//			PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
//			
//			preparedStatement.setString(1, "taratula");
//			preparedStatement.setString(2, "gtrf");
//			preparedStatement.setString(3, "gtrf");
//			preparedStatement.setString(4, "gtrf");
//			preparedStatement.setInt(5, 1);
//			preparedStatement.setInt(6, 10);
//			preparedStatement.setString(7, "gtrf");
//			preparedStatement.setString(8, "gtrf");
//			preparedStatement.setString(9, "gtrf");
//			preparedStatement.setString(10, "gtrf");			
//			preparedStatement.setTimestamp(11,
//					new Timestamp((new java.util.Date()).getTime()));		
//			preparedStatement.execute();
			
			
			
			Statement stmt = null;
		    String query = "select * from truyen order by view USING > limit 5";      
		    
		    stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            String title = rs.getString("title");
	            int view = rs.getInt("view");	   
	            
	            System.out.println(title + "\t" + view); 
	        }
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}