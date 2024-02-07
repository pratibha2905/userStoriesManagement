package com.poker.UserStoriesManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.poker.UserStoriesManagement.DTO.userStoryAddRequest;
import com.poker.UserStoriesManagement.DTO.userStoryDTO;
import com.poker.UserStoriesManagement.entity.USerStoryUpdate;
import com.poker.UserStoriesManagement.repo.userStoryUpdaterepo;

public class UserStoryUpdateServiceImpl implements UserStoryUpdateService{
	
	@Autowired
	userStoryUpdaterepo userrepo;
	
	@Autowired
	userStoryAddRequest addRequest;
	
	@Override
	public userStoryDTO registerUser(userStoryAddRequest addRequest) {
		USerStoryUpdate userEntity = new USerStoryUpdate();
		userEntity.setName(addRequest.getName());
		userEntity.setDescription(addRequest.getDescription());
		addRequest.setStatus("NEW");
		userEntity.setStatus(addRequest.getStatus());
		userStoryDTO userDto=new userStoryDTO();
		userDto.setDescription(userEntity.getDescription());
		userDto.setName(userEntity.getName());
		userDto.setStatus(userEntity.getStatus());
		return userDto;
		
	}

	@Override
	public String deletebyId(int id) {
		userrepo.deleteById(id);
		return "Success";
	}
	
	
	
}
