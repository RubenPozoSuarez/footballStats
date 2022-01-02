package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Team;
import com.footballStats.Luian.repository.TeamRepository;
import com.footballStats.Luian.service.TeamService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService{

	private TeamRepository teamRepository;
	
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

}
