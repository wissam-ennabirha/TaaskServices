package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Formation;
@CrossOrigin("*")
public interface FormationRepository extends JpaRepository<Formation, Long>{

}
