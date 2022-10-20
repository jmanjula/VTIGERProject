package jdbcpracticetest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;



public class ReadDateFromJdbctest {
	@Test
	 
	public void readDataTest()throws Throwable{
		     //step:1 register the driver
		 Driver dref= new Driver();
		DriverManager.registerDriver(dref);
		  //step:2 connect to database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
		//step:3 create statement
		Statement stmt= con .createStatement();
		 //step:4 execute query
		ResultSet result=stmt.executeQuery("select *from students_info");
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2));
		}
	      //step:5 close connection with database
		   con.close();
	}
		
		
		
		
		
	}

		// TODO Auto-generated method stub

	


