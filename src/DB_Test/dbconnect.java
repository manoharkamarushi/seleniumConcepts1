package DB_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;
import doubtsClarified.constructor;
public class dbconnect {

@Test
public void connect() throws ClassNotFoundException, SQLException{
	
	Connection con=null;
	Class.forName("org.SQLServer.JDBC");
	con=DriverManager.getConnection("");
 constructor c=new constructor(12);
 
}
	
}
