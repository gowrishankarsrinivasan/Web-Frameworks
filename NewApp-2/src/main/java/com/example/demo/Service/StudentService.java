package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
@Service
public class StudentService {
	@Autowired
	private StudentRepo stu;
	public Student savedata(Student s) {
		return stu.save(s);
	}
	public List<Student> findall(){
		return stu.findAll();
	}
	public void deleteDepartmentById(int id) {
		stu.deleteById(id);
	}
}