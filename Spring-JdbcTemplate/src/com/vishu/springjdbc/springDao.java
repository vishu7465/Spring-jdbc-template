package com.vishu.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class springDao  {
	 private DataSource dataSource;
	 private JdbcTemplate jdbctemp;
	public springDao(DataSource datasource) {
		this.dataSource=datasource;
		jdbctemp=new JdbcTemplate(datasource);
	}
	
	public int insert(Model m) {
	return	jdbctemp.update("insert into student values(?,?)",new Object[] {m.getId(),m.getName()});
	}
	
//	public Model update(int id) {
//		
//		
//	}
//	
//	public int delete(int id) {
//		
//	}
	public class StudentMapper implements RowMapper<Model> {
		   public Model mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Model std = new Model();
		      std.setId(rs.getInt("id"));
		      std.setName(rs.getString("name"));
		      
		      return std;
		   }
		}
}
