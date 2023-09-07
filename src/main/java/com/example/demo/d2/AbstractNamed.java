package com.example.demo.d2;

public abstract class AbstractNamed extends AbstractBase implements Named {

	private String name;

	public AbstractNamed(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
