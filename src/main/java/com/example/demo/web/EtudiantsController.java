package com.example.demo.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Task;
import com.example.demo.service.EtudiantsService;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("api/")

public class EtudiantsController {
	@Autowired
	EtudiantsService etudiantsService;
	
	@GetMapping("etudiants")
	public List<Etudiant> findAll()
	{
		return etudiantsService.findAll();
	}
	@PostMapping("etudiant")
	public Etudiant save(@RequestBody Etudiant task)
	{
		return etudiantsService.save(task);
	} 
	@GetMapping("etudiant/{id}")
	public Etudiant getOne(@PathVariable Long id)
	{
		return etudiantsService.findById(id);
	}
	
	@DeleteMapping("etudiant/{id}")
	public void delete(@PathVariable Long id)
	{
		etudiantsService.delete(id);
	}
	
	@PutMapping("etudiant")
	public void modifier(@RequestBody Etudiant task)
	{
		etudiantsService.modifier(task);
	}
	

}
