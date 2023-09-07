package com.example.demo.d4;

import java.util.List;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node(primaryLabel = "Person")
public class PersonEntity extends AbstractNamed {

	private String email;

	private List<Identifiable> actedIn;

	public PersonEntity(String name, String email) {
		super(name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public List<Identifiable> getActedIn() {
		return actedIn;
	}
}
