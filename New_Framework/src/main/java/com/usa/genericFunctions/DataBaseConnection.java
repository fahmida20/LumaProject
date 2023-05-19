package com.usa.genericFunctions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnection {
	public static void main(String[] args) throws Throwable {		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");		                                                                            // JDBC URL, Host Number, Database Name, UserName & Password		
		// Statement is an interface 
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery("select * from employees");
	    List<String> columnValue = new ArrayList<String>(); 
		while (rs.next()) {
			columnValue.add(rs.getString("Last_Name"));
		}
	    System.out.println(columnValue); 
	    }
	}

//First of all, with the help of Class, call the forName() and pass the parameter as location/path of the JDBC driver then =>
//With the help of DriverManager class, call the getConnection() and inside the parameter pass the JDBC url, host, schema, username and Password then store in the Connection interface instance then =>
//Help of Connection interface instance, call the createStatement() and inside the parenthesis with the help of ResultSet interface use Type_Scroll_Sensitive and Concur_Read_Only in order to handle the case sensitive issues (Upper case, Lower case like use TYPE_SCROLL_SENSITIVE and CONCUR_READ_ONLY) and store it in the Statement interface instance then =>
//With the help of Statement interface instance, Call the pre-define method executeQuery() and inside the parameter write the SQL Query as needed and store in ResultSet interface instance then => 
//Create object by using collection interface class in order to handle data then =>
//Create ArrayList class object in order to handle the data then =>
//Use loop (while) and give condition with the help of ResultSet instance call the next() and with the help of ArrayList object call the add() and inside the parameter with the help of ResultSet instance call the getString() and pass the parameter as whatever data you want to retrieve like “salary” will retrieve all salary from the table then =>
//Print it with the help of ArrayList class object

//if we dnt want to write select * from employees here we write it in config.properties file like 
//innerJoin=select * from employees and paste here in code inside parenthesis innerJoin.



