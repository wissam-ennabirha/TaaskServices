package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	
	List<Etudiant> findByNomContains(String nom);

}
