package com.example.demo;

import org.axonframework.commandhandling.SimpleCommandBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RadarServiceExApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceExApplication.class, args);
		System.out.println("radar started");
	}
    @Bean
    public SimpleCommandBus axonServerCommandBus(){
        return SimpleCommandBus.builder().build();
    }

}
