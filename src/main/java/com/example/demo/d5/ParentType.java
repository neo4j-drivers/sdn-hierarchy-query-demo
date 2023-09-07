package com.example.demo.d5;

import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

/**
 * @author Gerrit Meier
 */
@Node("Entity")
public class ParentType extends AbstractNamed {

	// This relationship might be obfuscated by the class hierarchy
	// but creates a cyclic mapping
	@Relationship
	List<ParentType> parentTypes;

	public ParentType(String name) {
		super(name);
	}
}
