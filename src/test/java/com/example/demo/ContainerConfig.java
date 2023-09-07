package com.example.demo;

import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.Neo4jContainer;

import jakarta.annotation.PostConstruct;

class ContainerConfig {

	@Bean
	@ServiceConnection
	public Neo4jContainer<?> neo4jContainer() {
		return new Neo4jContainer<>("neo4j:5").withReuse(true); // <.>
	}

}