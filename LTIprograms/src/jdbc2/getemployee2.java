package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class getemployee2 {

	public static void main(String[] args) {
		try {//load the driver in the memory
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	           //1  : type of the driver, port number and service name
	           //2  : username
	           //3    : password
	        System.out.println("connection is successful!!!");
	        String str1="insert into emp3 values(4,'ketan', 60000)";
            //String str1="delete from emp3 where empno=3";
            //String str1="update emp3 set ename='mohanraj' where empno=3";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(str1);
            con.close();
	       }
	       catch(Exception e)
	       {
	            System.out.println(e);
	       }
		// TODO Auto-generated method student

	}

}
