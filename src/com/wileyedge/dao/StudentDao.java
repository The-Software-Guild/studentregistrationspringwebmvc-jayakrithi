package com.wileyedge.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wileyedge.model.Student;

public class StudentDao implements IDao {
	
	public StudentDao(){}
	
	public Connection openConnection() {
		Connection con = null;
		try {
			// typer 4 driver is registered with Driver Manager.
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/stud", "root", "root");
			System.out.println("MySQL driver registered with DriverManager");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL suitable driver not found ");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void saveStudent(Student s) {
		System.out.println("Inside student");
//		int id = student.getId();
		String name = s.getName();
		String age = s.getAge();
		String mobileno = s.getMobileno();
		String address = s.getAddress();
		
		Connection con = openConnection();
		
		try {			
			String sql = "INSERT INTO STUDENT(NAME, AGE, MOBILENO, ADDRESS) VALUES(?,?,?,?)";
			PreparedStatement pstat = con.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, age);
			pstat.setString(3, mobileno);
			pstat.setString(4, address);
			int n = pstat.executeUpdate();
			

			System.out.println("Number of rows inserted "+ n);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		closeConnection(con);	

	}

}
