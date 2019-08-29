package com.app.repo;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.model.Student;

@Repository
public interface IStudentRepo  extends MongoRepository<Student,String>  {

	
	public List<Student> findBynames(String names);
	public List<Student> findBynumDocument(String numDocument);
  //  public List<Student> findBydateBirthStudent(LocalDate dateBirthStudent);

}
