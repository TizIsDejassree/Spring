package com.example.dayone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DayOne7Application {

	public static void main(String[] args)throws JsonProcessingException {
		SpringApplication.run(DayOne7Application.class, args);
		Third obj=new Third(1,"kani","67");
		ObjectMapper o=new ObjectMapper();
		String json=o.writeValueAsString(obj);
		System.out.print(json);
		//hi
	}

}
