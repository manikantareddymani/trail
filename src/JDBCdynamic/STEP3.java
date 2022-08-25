package JDBCdynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class STEP3 {

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
	 Statement st=cn.createStatement();

} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
