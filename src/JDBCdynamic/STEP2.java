package JDBCdynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class STEP2 {

	public static void main(String[] args) {

    Scanner scn=new Scanner(System.in);
    System.out.println("Enter driver name:");
    String dr=scn.next();
    System.out.println("Enter url name:");
    String url=scn.next();
    try {
		Class.forName(url);
		System.out.println("loading and registerd:");
		Connection cn = DriverManager.getConnection(url);
		System.out.println("Connectoin is created:");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
