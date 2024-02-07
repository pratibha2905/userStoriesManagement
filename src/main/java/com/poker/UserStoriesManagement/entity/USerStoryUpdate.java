package com.poker.UserStoriesManagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class USerStoryUpdate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="Description")
	private String description;
	
	@Column(name="vote")
	private Boolean votepermission=false;

	public USerStoryUpdate() {
		super();
		this.id = id;
		this.status = status;
		this.name = name;
		this.description = description;
		this.votepermission = votepermission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getVotepermission() {
		return votepermission;
	}

	public void setVotepermission(Boolean votepermission) {
		this.votepermission = votepermission;
	}
	
	

}
