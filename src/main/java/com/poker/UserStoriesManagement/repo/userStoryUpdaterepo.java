package com.poker.UserStoriesManagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poker.UserStoriesManagement.DTO.userStoryAddRequest;
import com.poker.UserStoriesManagement.DTO.userStoryDTO;
import com.poker.UserStoriesManagement.entity.USerStoryUpdate;


@Repository
public interface userStoryUpdaterepo extends JpaRepository<USerStoryUpdate, Integer> {
	List<userStoryDTO> findByUserStoryName(userStoryAddRequest addRequest);
	void deleteByUserId(Integer id);
}
