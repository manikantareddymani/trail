package JDBCdynamic;

import java.util.Scanner;

public class STEP1 {
	
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter drive name:");
	String dr=scn.next();
	try {
		Class.forName(dr);
		System.out.println("loading and registering:");
	} catch (ClassNotFoundException e) {

		e.printStackTrace();
	}
}
}
