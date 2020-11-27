package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EtudiantRepository;
import com.example.demo.Repository.TaskRepository;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Task;

@Service
public class EtudiantsService {
	
	@Autowired
	EtudiantRepository etudiantRepository;
	public List<Etudiant> findAll()
	{
		return etudiantRepository.findAll();
	}
	public Etudiant save(Etudiant task)
	{
		return etudiantRepository.save(task);
	}
	public void delete(Long id)
	{
		etudiantRepository.deleteById(id);
	}
	public Etudiant findById(Long id)
	{
		return etudiantRepository.getOne(id);
	}
	
	public Etudiant modifier(Etudiant task)
	{
		return etudiantRepository.save(task);
	}  
	
}
