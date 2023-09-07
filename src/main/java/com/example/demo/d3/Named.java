package com.example.demo.d3;

import org.springframework.data.neo4j.core.schema.Node;

@Node(labels = "Named")
public interface Named extends Identifiable {

	String getName();
}
