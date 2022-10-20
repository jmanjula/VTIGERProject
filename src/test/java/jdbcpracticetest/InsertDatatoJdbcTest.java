package jdbcpracticetest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class InsertDatatoJdbcTest {
	@Test
	 
	public void readDataTest()throws Throwable{
		     //step:1 register the driver
		 try {
			Driver dref= new Driver();
			DriverManager.registerDriver(dref);
			  //step:2 connect to database
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			//step:3 create statement
			Statement stmt= con .createStatement();


			int result =stmt.executeUpdate("insert into students_info(regno, firstname, middlename, lastname)values(4,'man','gowda','h')");
			if(result==1)
			{
				System.out.println(" Data is stored");
			}
			else
			{
				System.out.println("Data is not stored");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 System.out.println("con is closed");
		 }

	}

	
		// TODO Auto-generated method stub
		
	}


