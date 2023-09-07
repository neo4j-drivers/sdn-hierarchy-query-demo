package com.example.demo.d3;

import java.util.List;

import org.springframework.data.neo4j.core.schema.Node;

@Node(primaryLabel = "Person")
public class PersonEntity extends AbstractNamed implements Identifiable {

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
