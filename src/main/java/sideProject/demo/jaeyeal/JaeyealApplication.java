package sideProject.demo.jaeyeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JaeyealApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaeyealApplication.class, args);
	}

}
