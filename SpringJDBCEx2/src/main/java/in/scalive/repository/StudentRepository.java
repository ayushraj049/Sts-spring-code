package in.scalive.repository;
import in.scalive.model.Student;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public StudentRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public void save(Student s) {
		String sql="Insert into students values(?,?,?)";
		int count=jdbcTemplate.update(sql,s.getRoll(),s.getName(),s.getPer());
		System.out.println("rec inserted :"+count);
	}
	public int getCount() {
		String sql="select count(*)from students";
		int count=jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}
	public String findById(int roll) {
	    String name = "";

	    String sql = "Select name from Students where roll=?";

	    try {
	        name = jdbcTemplate.queryForObject(sql, String.class, roll);
	    } catch (EmptyResultDataAccessException ex) {
	        name = null;
	    } finally {
	        return name;
	    }
	}

}
