package com.smi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.smi.bo.EmployeeBO;

@Component("dao")
public final class EmployeeDataIMPL implements EmployeeData {

	private DataSource ds;
	private String query = "select * from Employee where job in (?,?,?))";
	private List<EmployeeBO> li;
	Connection con;
	PreparedStatement ps;


	
	public EmployeeDataIMPL(DataSource ds) {
		super();
		this.ds = ds;
	}

	@Override
	public List<EmployeeBO> getDetails() throws Exception {
		li = new ArrayList();
		EmployeeBO bo = null;
		ResultSet re = null;
		try {

			con = ds.getConnection();

			ps = con.prepareStatement(query);
			re = ps.executeQuery();

			while (re.next()) {
				bo = new EmployeeBO();

				bo.setId(re.getInt(1));
				bo.setName(re.getString(2));
				bo.setJob(re.getString(3));
				bo.setDeptno(re.getInt(4));
				bo.setSal(re.getFloat(5));

				li.add(bo);

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (con != null)
					con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (ps != null)
					ps.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return li;
	}

}
