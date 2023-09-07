package com.example.demo.d5;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import java.time.LocalDateTime;

public abstract class AbstractBase {

	@Id
	@GeneratedValue
	private String id;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime lastModifiedAt;

	public String getId() {
		return id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getLastModifiedAt() {
		return lastModifiedAt;
	}
}
