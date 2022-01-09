package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Season;
import com.footballStats.Luian.repository.SeasonRepository;
import com.footballStats.Luian.service.SeasonService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SeasonServiceImpl implements SeasonService {

	private SeasonRepository seasonRepository;
	
	public List<Season> getAllSeasons() {
		return seasonRepository.findAll();
	}

}
