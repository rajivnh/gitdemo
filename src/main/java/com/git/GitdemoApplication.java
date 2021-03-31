package com.git;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

	@Bean 
	public Supplier<String> supply() {
		return () -> "Hello From RAJIV";
	}
	
	@Bean 
	public Consumer<String> consume() {
		return (n) -> System.out.println(n);
	}
	
	@Bean 
	public Function<String, String> name() {
		return (n) -> n + " k";
	}
}
