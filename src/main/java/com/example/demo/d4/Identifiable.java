package com.example.demo.d4;

import org.springframework.data.neo4j.core.schema.Node;

@Node("Entity")
public interface Identifiable {

	String getId();
}
