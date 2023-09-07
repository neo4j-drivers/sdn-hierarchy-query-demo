package com.example.demo.d5;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface PersonRepository extends Neo4jRepository<PersonEntity, String> {

	Optional<PersonEntity> findOneByName(String name);
}
