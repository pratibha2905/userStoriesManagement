package com.poker.UserStoriesManagement.Service;

import org.springframework.http.ResponseEntity;

import com.poker.UserStoriesManagement.DTO.userStoryAddRequest;
import com.poker.UserStoriesManagement.DTO.userStoryDTO;

public interface UserStoryUpdateService {

	//public userStoryDTO registerUser(userStoryAddRequest addRequest);

	public String deletebyId(int id);

	public userStoryDTO registerUser(userStoryAddRequest addRequest);

}
