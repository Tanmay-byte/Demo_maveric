package Selenium;

import java.sql.Connection;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
public class Demo {
	private static String query;



	   public static void main(String[] args) throws InterruptedException, FilloException {
	        Fillo fillo=new Fillo();
	        com.codoid.products.fillo. Connection connection=fillo.getConnection("C:\\Users\\tanmayt\\Downloads\\Book1.xlsx");
	        //String query="INSERT INTO sheet1(Name,id,location) VALUES('siva',4,'perungudi')";connection.executeUpdate(query);
	        //String query="Select * from Sheet1 where name='vanitha'";
	        String query="Update Sheet1 Set location='Ramaeshwaram' where ID=1 and name='tanmay'";
	        connection.executeUpdate(query);



	       Recordset recordset=((com.codoid.products.fillo.Connection) connection).executeQuery(query);
	         
	        while(recordset.next()){
	        System.out.println(recordset.getField("location"));
	        }     
	        recordset.close();
	        connection.close();
	        
	    }



	}