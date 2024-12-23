package starez.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import starez.demo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository <StudentEntity, Integer>{
    
}
