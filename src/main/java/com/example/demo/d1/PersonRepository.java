package com.example.demo.d1;

import java.util.Optional;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<PersonEntity, String> {

	Optional<PersonEntity> findOneByName(String name);
}
