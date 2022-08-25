package JDBCdynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class STEP4 {

		public static void main(String[] args) {
			Scanner scn =new Scanner(System.in);
			 System.out.println("Enter driver name:");
			 String dr=scn.next();
			 System.out.println("Enter url name:");
			 String url =scn.next();
			 try {
				Class.forName(dr);
				System.out.println("loading and registered:");
				 Connection cn =DriverManager.getConnection(url);
				 System.out.println("connection completed");
				 Statement st=cn.createStatement();
				 ResultSet rs=st.executeQuery("Select * from student.student_details");
				 //st.execute("INSERT INTO  student.student_details VALUES(1,'manikanta','b.tech')");
 while(rs.next()) {
	 System.out.println("id="+rs.getInt(1));
	 System.out.println("name="+rs.getString(2));
	 System.out.println("degree="+rs.getString(3));
	 System.out.println("------*****---------");

 }
 
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
		}
}
