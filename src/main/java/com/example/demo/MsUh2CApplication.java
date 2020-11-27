package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Repository.EtudiantRepository;
import com.example.demo.Repository.FormationRepository;
import com.example.demo.Repository.TaskRepository;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Task;

@SpringBootApplication
public class MsUh2CApplication implements CommandLineRunner {
	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	@Autowired
	private TaskRepository taskRepository;

   
	public static void main(String[] args) {
		SpringApplication.run(MsUh2CApplication.class, args);
	}
  
	@Override
	public void run(String... args) throws Exception {
		
		taskRepository.save(new Task(null,"Java",false));
		taskRepository.save(new Task(null,"ANGULAR",true));
		taskRepository.save(new Task(null,"react js",true));
		taskRepository.save(new Task(null,"PHP",false));
	            
	}
/*	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:3000")
				.allowedHeaders("*")
				.allowedMethods("OPTION","HEAD","PUT","GET","POST","DELETE","PATCH");
			} 
		};
	}
*/
}
