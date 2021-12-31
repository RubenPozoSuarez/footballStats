package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Matchday;
import com.footballStats.Luian.repository.MatchdayRepository;
import com.footballStats.Luian.service.MatchdayService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MatchdayServiceImpl implements MatchdayService {
	
	private MatchdayRepository matchdayRepository;
	
	@Override
	public List<Matchday> getAllMatchdays() {
		return matchdayRepository.findAll();
	}
	
}
