package in.scalive.repository;
import in.scalive.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
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

}
