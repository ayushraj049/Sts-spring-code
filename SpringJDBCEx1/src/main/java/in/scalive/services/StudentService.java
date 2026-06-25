package in.scalive.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.scalive.model.Student;
import in.scalive.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository repo;
	@Autowired
	public StudentService(StudentRepository repo) {
		this.repo=repo;
		
	}
	public void addStudent(Student s) {
		repo.save(s);
		
		
	}

}
