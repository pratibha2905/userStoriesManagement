package com.poker.UserStoriesManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poker.UserStoriesManagement.DTO.userStoryAddRequest;
import com.poker.UserStoriesManagement.DTO.userStoryDTO;
import com.poker.UserStoriesManagement.Service.UserStoryUpdateService;

@RestController
@RequestMapping(value="/userStoryUpdate")
public class userStoryController {
	
	@Autowired
	UserStoryUpdateService userStoryUpdateService;
	
	@PostMapping(value="/userStoryUpdate")
	public ResponseEntity<userStoryDTO> register(@RequestBody userStoryAddRequest addRequest) throws Exception {
		return new ResponseEntity<userStoryDTO>(userStoryUpdateService.registerUser(addRequest), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/userStoryUpdate/delete/{id}")
	public String deletebyId(@PathVariable("id") int id) throws Exception {
		return  userStoryUpdateService.deletebyId(id);
	}

}
