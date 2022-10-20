package jdbcpracticetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class TryGarbbageTest {

	
		
			
			@Test

			public void readData() throws Throwable {
				//Step1 Register JDBD
				//Step2 Connect to databases
				Connection con=null;
				try {
					Driver dref=new com.mysql.jdbc.Driver();
					DriverManager.registerDriver(dref);
					con = (Connection) DriverManager.getConnection("Jdbc:mysql://localhost:3306/students","root","root");
					//Step3	Create Statement
					Statement stmt= (Statement) con.createStatement();
					//Step4 Execute Query
					ResultSet Result = ((java.sql.Statement) stmt).executeQuery("select * from Student_info");
					while(Result.next())
					{
						System.out.println(Result.getString(1)+""+Result.getString(2));		
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
				//Step5 Close connection with DB
				con.close();
				System.out.println("connection closed");
			}
		}
	}
		// TODO Auto-generated method stub

	
