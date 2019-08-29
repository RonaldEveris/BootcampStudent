package com.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.repo.IStudentRepo;


@RestController
public class RestControllerStudent {

	@Autowired
	private IStudentRepo rep;
	
	//@Autowired
	//private StudentService msj;
	
	@GetMapping("/prueba")
	public String mensaje(){
		return  "Welcome Student";
	}
	
	
	@GetMapping("/listStudent")
	public List<Student> listar(){
		return rep.findAll();
	}
	
	@PostMapping
	public  void insertar(@RequestBody Student p) {
		rep.save(p);
	}
	
	@PutMapping
	public void modificar(@RequestBody Student p) {
		rep.save(p);
	}
	
	@DeleteMapping(value="{/id}")
	public void eliminar(@PathVariable("id") String id) {
		
		rep.deleteById(id);
	}
	
	@GetMapping("/nameStudent/{names}")
	public List<Student> buscarNombre(@PathVariable(value="names") String names ){
		return rep.findBynames(names);
	}
	
	@GetMapping("/dniStudent/{numDocument}")
	public List<Student> buscarDni(@PathVariable("numDocument") String numDocument){
		return rep.findBynumDocument(numDocument);
	}
	
   /* //Falta implementar....
	@GetMapping("/buscarfecha/{dateBirthStudent}")
	public List<Student> buscarFecha(@PathVariable("dateBirthStudent") @JsonSerialize(using=DateSerializer.class) LocalDate dateBirthStudent){
		return r*ep.findBydateBirthStudent(dateBirthStudent);
	}
	*/
	
}
