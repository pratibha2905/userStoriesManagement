package com.poker.UserStoriesManagement.DTO;

import jakarta.persistence.Column;

public class userStoryDTO {

private int id;
	
	private String status;
	
	private String name;
	
	private String description;
	
	private Boolean votepermission=false;

	public userStoryDTO(int id, String status, String name, String description, Boolean votepermission) {
		super();
		this.id = id;
		this.status = status;
		this.name = name;
		this.description = description;
		this.votepermission = votepermission;
	}

	public userStoryDTO() {
		// TODO Auto-generated constructor stub
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
