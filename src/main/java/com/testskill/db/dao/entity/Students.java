package com.testskill.db.dao.entity;

import javax.persistence.*;

@Entity
public class Students {
	@Id
	private Long id;
	private String name;
	private Long marks;

	public Students() {
		super();
	}

	public Students(Long id, String name, Long marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMarks() {
		return marks;
	}

	public void setMarks(Long marks) {
		this.marks = marks;
	}

}