package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Competition;
import com.footballStats.Luian.repository.CompetitionRepository;
import com.footballStats.Luian.service.CompetitionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompetitionServiceImpl implements CompetitionService {

	private CompetitionRepository competitionRepository;

	public List<Competition> getAllCompetitions() {
		return competitionRepository.findAll();
	}
}
