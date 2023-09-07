package com.example.demo.d5;

import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;

@Node(primaryLabel = "Person")
public class PersonEntity extends ParentType {

	private String email;

	private List<MovieEntity> actedIn;

	public PersonEntity(String name, String email) {
		super(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public List<MovieEntity> getActedIn() {
		return actedIn;
	}
}
