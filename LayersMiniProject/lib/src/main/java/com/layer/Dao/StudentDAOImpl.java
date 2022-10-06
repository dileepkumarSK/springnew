package com.layer.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.layer.bo.StudentBo;

public class StudentDAOImpl implements StudentDAO {
     
	private  static final  String   CUSTOMER_INSERT_QUERY="INSERT INTO student(id,name,m1,m2,m3) VALUES(?,?,?,?,?)";
	private  DataSource ds;

	
	public StudentDAOImpl(DataSource ds) {
		
		this.ds = ds;
	}

	public int insert(StudentBo bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		con=ds.getConnection();
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
		
		ps.setInt(1,bo.getId());
		ps.setString(2, bo.getName());
		ps.setInt(3,bo.getM1());
		ps.setInt(4,bo.getM2());
		ps.setInt(5,bo.getM3());
		
		
		 count=ps.executeUpdate();
		
		return count;
	}

}
