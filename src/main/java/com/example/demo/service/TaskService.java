package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TaskRepository;
import com.example.demo.entities.Task;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	public List<Task> findAll()
	{
		return taskRepository.findAll();
	}
	public Task save(Task task)
	{
		return taskRepository.save(task);
	}
	public void delete(Long id)
	{
		taskRepository.deleteById(id);
	}
	public Task findById(Long id)
	{
		return taskRepository.getOne(id);
	}
	public void update(Long id, Task taskrequest)
	{
		Task task =taskRepository.getOne(id);
		task.setCompleted(taskrequest.isCompleted());
		
		taskRepository.save(task);
				
	}
	public Task modifier(Task task)
	{
		return taskRepository.save(task);
	}  
	
}
