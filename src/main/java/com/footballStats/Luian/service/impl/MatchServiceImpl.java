package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Matches;
import com.footballStats.Luian.repository.MatchRepository;
import com.footballStats.Luian.service.MatchService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {
	
	private MatchRepository matchRepository;

	@Override
	public List<Matches> getAllMatches() {
		return matchRepository.findAll();
	}
}
