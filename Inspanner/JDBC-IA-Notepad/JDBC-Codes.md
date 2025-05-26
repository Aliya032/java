### 1. to simply make the connection:

```
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
```

### 2. to retrieve values from an already existing table inside the student database

```
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
```

### 3. to create an empty table inside student database

```
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
```

### 4. to insert into that earlier created table

```
// insertion of values using jdbc in the earlier created table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver4 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			String sql = "INSERT INTO inspanner_students(RollNumber, Name) values(?,?);";

			PreparedStatement pst = conn.prepareStatement(sql);

			pst.setInt(1, 33);
			pst.setString(2, "Aliya");

			pst.executeUpdate();

			conn.close();

		} catch (Exception e) {
			System.out.println("Error occured: " + e);
		}
	}
}

```

### 5. using scanner class and taking values from the user and inserting it using jdbc

```
//using scanner class to take input from the user and insert into that table

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver5 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number and name: ");
		int roll = sc.nextInt();
		String name = sc.next();

		String sql = "INSERT INTO inspanner_students values ("  +roll + ", ' "  + name + " ')";

		System.out.println(sql);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			Statement st = conn.createStatement();

			int rows = st.executeUpdate(sql);

			if (rows > 0)
				System.out.println("Row successfully inserted");

			conn.close();
		} catch (Exception e) {
			System.out.println("Unsuccessful insertion - " + e);
		}
	}
}
```

### 6. updating a the name of a student whose roll number is so and so

```
//using scanner class to take input from the user for updating a row

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;

public class LoadDriver6 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number to update: ");
		int roll = sc.nextInt();
		System.out.println("Enter name to update: ");
		String name = sc.next();

		String sql = "UPDATE  inspanner_students " + "SET Name = ?" + " WHERE RollNumber = ? ";

		System.out.println(roll + " " + name);

		System.out.println(sql);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student?" + "user=root&password=Aliya@032");

			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setInt(2, roll);

			int rows = pstmt.executeUpdate();
			if (rows > 0 )
				System.out.println("Row successfully updated");

			conn.close();

		} catch (Exception e) {
			System.out.println("didn't get inserted: " + e);
		}
	}
}
```

### 7.
