package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jReactiveDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import com.example.demo.d1.PersonEntity;

@SpringBootApplication(exclude = {Neo4jRepositoriesAutoConfiguration.class, Neo4jReactiveDataAutoConfiguration.class})
public class Demo1Application {

	@Configuration
	@EnableAutoConfiguration(exclude = {Neo4jRepositoriesAutoConfiguration.class, Neo4jDataAutoConfiguration.class})
	@EntityScan("n/a")
	@Profile("default")
	static class NoNeo4j {
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
