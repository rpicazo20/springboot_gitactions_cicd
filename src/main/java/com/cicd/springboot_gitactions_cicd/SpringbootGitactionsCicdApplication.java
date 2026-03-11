package com.cicd.springboot_gitactions_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGitactionsCicdApplication {

	public String saliudar(){
		return "bienvenido al curso de CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitactionsCicdApplication.class, args);
	}

}
