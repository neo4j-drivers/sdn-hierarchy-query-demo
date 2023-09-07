package com.example.demo.d3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Profile("d3")
@Configuration
@EnableNeo4jRepositories(basePackageClasses = PersonEntity.class)
@EntityScan(basePackageClasses = PersonEntity.class)
public class Config {

	@Bean
	CommandLineRunner demo2(PersonRepository personRepository) {
		return args -> {
			System.out.println("Variant 3 (Sharing a label for fun and profit)");
			personRepository.findOneByName("Keanu Reeves")
				.ifPresent(p -> {
					System.out.println(p.getName());
					p.getActedIn().forEach(m -> System.out.println(m.getTitle()));
				});
		};
	}
}
