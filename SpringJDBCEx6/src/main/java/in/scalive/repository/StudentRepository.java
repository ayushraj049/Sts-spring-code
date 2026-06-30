package in.scalive.repository;
import in.scalive.model.Student;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private NamedParameterJdbcTemplate nmTemp;
	@Autowired
	public StudentRepository(NamedParameterJdbcTemplate nmTemp) {
		this.nmTemp=nmTemp;
	}
	public void save(Student s) {
		String sql="Insert into students values(:roll,:name,:per)";
		Map<String,Object>map=new HashMap<>();
		map.put("roll", s.getRoll());
		map.put("name", s.getName());
		map.put("per", s.getPer());
		int count=nmTemp.update(sql,map);
		System.out.println("rec inserted :"+count);
	}
	public String findById(int r) {
		String name="";
		String sql="select name from students where roll=:roll";
		Map<String, Object>map=new HashMap<>();
		map.put("roll", r);
		try {
			name=nmTemp.queryForObject(sql, map, String.class);
		}catch(EmptyResultDataAccessException ex) {
			name=null;
		}
		finally {
			return name;
		}
		
		
	}
	public int getCount() {
		String sql="select count(*)from students";
		int count=nmTemp.getJdbcOperations().queryForObject(sql, Integer.class);
		return count;
	}
	

}
