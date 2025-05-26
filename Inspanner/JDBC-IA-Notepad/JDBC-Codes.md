## to simply make the connection:

`
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {
public static void main(String args[]) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("My SQL server connected successfully");
} catch (Exception e) {
System.out.println("Error loading driver: " + e);
}
}
}
`

## to retrieve values from an already existing table inside the student database

`
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class LoadDriver2 {
public static void main(String args[]) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");
Statement stmt = null;
ResultSet rs = null;

    		try {
    			stmt = conn.createStatement();
    			rs = stmt.executeQuery("SELECT * FROM student_details");
    		} catch (SQLException e) {
    			System.out.println("SQLException: " + e.getMessage());
    			System.out.println("SQLState: " + e.getSQLState());
    			System.out.println("Vendor State: " + e.getErrorCode());
    		} finally {
    			if (rs != null) {
    				try {
    					System.out.println(rs);
    					while(rs.next()) {
    						System.out.println(rs.getString("FirstName"));
    					}
    					rs.close();
    				} catch (SQLException sqlEx) {}
    				rs = null;
    		}
    		if (stmt != null ) {
    			try {
    				stmt.close();
    			} catch (SQLException sqlEx) {}

    			stmt = null;
    			}
    		}
    	} catch (Exception ex) {
    		System.out.println("Error in: " + ex);
    		}

    }

}
`

## to create an empty table inside student database

`
// creation of a table using jdbc

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.\*;

public class LoadDriver3 {
public static void main(String args[]) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

    		String sql = "CREATE TABLE inspanner_students(RollNumber integer, Name varchar(255))";

    		Statement st = conn.createStatement();
    		st.executeUpdate(sql);

    		conn.close(); //closing the connection
    	} catch (Exception e) {
    		System.out.println("Error occured: " + e);
    	}

    }

}

`
