package com.example.ob_cineList;

import com.example.ob_cineList.repository.MovieRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObCineListApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ObCineListApplication.class, args);
		MovieRepository repository = context.getBean(MovieRepository.class);

	}

}
