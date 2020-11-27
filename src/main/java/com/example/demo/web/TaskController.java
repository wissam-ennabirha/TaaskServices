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

import com.example.demo.entities.Task;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins="http://localhost:3000")
public class TaskController {
	@Autowired
	TaskService taskService;
	
	@GetMapping("tasks")
	public List<Task> findAll()
	{
		return taskService.findAll();
	}
	@PostMapping("task")
	public Task save(@RequestBody Task task)
	{
		return taskService.save(task);
	} 
	@GetMapping("task/{id}")
	public Task getOne(@PathVariable Long id)
	{
		return taskService.findById(id);
	}
	   
	@DeleteMapping("task/{id}")
	public void delete(@PathVariable Long id)
	{
		 taskService.delete(id);
	}
	@PatchMapping("task/{id}")
	public void update(@PathVariable Long id,@RequestBody Task taskrequest)
	{
		 taskService.update(id, taskrequest);
	}
	@PutMapping("task")
	public void modifier(@RequestBody Task task)
	{
		taskService.modifier(task);
	}
	

}
