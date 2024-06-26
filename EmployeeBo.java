package com.tap2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeBo {
	private Connection connection;
	private PreparedStatement statement;
	static final String url="jdbc:mysql://localhost:3306/jdbc2";
	static final String username="root";
	static final String password="193n1A0515";
	static final String Insert_Query="insert into `employee2`(`id`,`name`,`email`,`dept`,`sal`) values(?,?,?,?,?)";
	public EmployeeBo() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public int save(Employee e) {
		try {
			statement=connection.prepareStatement(Insert_Query);
			statement.setInt(1,e.getId());
			statement.setString(2,e.getName());
			statement.setString(3,e.getEmail());
			statement.setString(4,e.getDept());
			statement.setInt(5,e.getSal());
			int i=statement.executeUpdate();
			return i;
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			try {
				if(statement!=null) {
					statement.close();
				}
				if(connection!=null) {
					statement.close();
				}
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}

}
