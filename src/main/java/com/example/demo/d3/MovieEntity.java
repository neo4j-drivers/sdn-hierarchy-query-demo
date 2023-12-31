package com.example.demo.d3;

import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node(primaryLabel = "Movie")
public class MovieEntity extends AbstractBase  implements Identifiable {

	private final String title;

	private Integer released;

	@Transient
	@Relationship(direction = Relationship.Direction.INCOMING, type = "DIRECTED")
	private List<PersonEntity> directors;

	public MovieEntity(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public Integer getReleased() {
		return released;
	}

	public void setReleased(Integer released) {
		this.released = released;
	}
}
