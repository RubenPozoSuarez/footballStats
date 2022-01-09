package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.TeamStat;
import com.footballStats.Luian.repository.MatchRepository;
import com.footballStats.Luian.repository.TeamStatRepository;
import com.footballStats.Luian.service.TeamStatService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeamStatServiceImpl implements TeamStatService {

	private TeamStatRepository teamStatRepository;
	
	public List<TeamStat> getAllTeamStat() {
		return teamStatRepository.findAll();
	}
}
