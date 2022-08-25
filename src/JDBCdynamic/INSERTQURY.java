package JDBCdynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class INSERTQURY {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Connection cn =null;
	    Statement st =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  cn =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=Mani@123&&useSSl=false");
			  st=cn.createStatement();
			 
			 int v=0;
					 do {
						System.out.println("Enter id:");
						int id=scn.nextInt();
						System.out.println("Enter name:");
						String name=scn.next();
						System.out.println("Enter a degree:");
						String degree=scn.next();
						String quary=("insert into student.student_details values("+id+",'"+name+"','"+degree+"')");
						st.execute(quary);
						System.out.println("press enter 1 enter value again:");
						v=scn.nextInt();
			             System.out.println("Data is inserted:");

					 }while(v==1);
            
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}finally {
	try {
		st.close();
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	}

}
