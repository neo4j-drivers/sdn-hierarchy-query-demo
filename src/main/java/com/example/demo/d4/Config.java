package com.example.demo.d4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Profile("d4")
@Configuration
@EnableNeo4jRepositories(basePackageClasses = PersonEntity.class)
@EntityScan(basePackageClasses = PersonEntity.class)
public class Config {

	@Bean
	CommandLineRunner demo2(PersonRepository personRepository) {
		return args -> {
			System.out.println("Relating to a generic class");
			personRepository.findOneByName("Keanu Reeves")
				.ifPresent(p -> {
					System.out.println(p.getName());
					p.getActedIn().forEach(m -> System.out.println(m.getId()));
				});
		};
	}
}
