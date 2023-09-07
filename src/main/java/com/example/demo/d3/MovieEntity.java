package com.example.demo.d3;

import org.springframework.data.neo4j.core.schema.Node;

@Node(primaryLabel = "Movie")
public class MovieEntity extends AbstractBase  implements Identifiable {

	private final String title;

	private Integer released;

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
