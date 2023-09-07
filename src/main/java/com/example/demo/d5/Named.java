package com.example.demo.d5;

import org.springframework.data.neo4j.core.schema.Node;

@Node(labels = "Named")
public interface Named {

	String getName();
}
