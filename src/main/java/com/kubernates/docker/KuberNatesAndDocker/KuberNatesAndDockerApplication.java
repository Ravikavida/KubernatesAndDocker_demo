package com.kubernates.docker.KuberNatesAndDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com" )
public class KuberNatesAndDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuberNatesAndDockerApplication.class, args);
	}

}
