package ConnectDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class UsingCollections {

	Connection conn = ConnectionUtil.getConnection();
	
	public void listentries(){
		
	   try{
		String select_query = "SELECT * FROM Employee";
		Statement statement = conn.createStatement();
		ResultSet rs = statement.executeQuery(select_query);
		List<String> list = new ArrayList<>();
		 while(rs.next()){
			 System.out.println("Employee Id:  " + rs.getInt(1) + " Employee Name:  " + rs.getString(2)
				+ " Employee Designation  " + rs.getString(3)+ " Employee Ph Number:" +rs.getString(4));
		 }
	   }
	   catch(Exception ae){
		   System.err.println(ae.getMessage());
	   }
		
    }
}
