package starez.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import starez.demo.Repository.StudentRepository;
import starez.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository repo;
    //get all the students
    @GetMapping("/students")
    public List <StudentEntity> getAllStudents() {
        List <StudentEntity> students = repo.findAll();
        return students;
    }
    @GetMapping("/students/{rollNo}")
    public StudentEntity getStudent(@PathVariable int rollNo) {
        StudentEntity student = repo.findById(rollNo).get();
        return student;
    }
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentEntity student) {
        repo.save(student); 
        
    }
    @PutMapping("/students/update/{id}")
    public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity student) {
        StudentEntity students = repo.findById(id).get();
        students.setName(student.getName());
        students.setPercentage(student.getPercentage());
        students.setBranch(student.getBranch());
        repo.save(students);
        return students;
    }
    @DeleteMapping("/students/delete/{id}")
    public void deleteStudent(@PathVariable int id ) {
        repo.deleteById(id);
    }
    
}
