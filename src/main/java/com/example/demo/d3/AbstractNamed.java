package com.example.demo.d3;

import org.springframework.data.neo4j.core.schema.Node;

public abstract class AbstractNamed extends AbstractBase implements Named {

	private String name;

	public AbstractNamed(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
