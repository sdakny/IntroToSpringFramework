package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Greet;

/**
* SpringBoot startup class
*/
@SpringBootApplication
public class DependencyInjectionSampleApplication {
	/**
	* main method
	* @param args
	*/
	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSampleApplication.class, args)
		.getBean(DependencyInjectionSampleApplication.class).execute();
	}
	/**
	* Place to be injected(interface)
	*/
	@Autowired
	Greet greet;
	
	/**
	* execute method
	*/
	private void execute() {
		greet.greeting();
	}
}