package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Stat;
import com.footballStats.Luian.repository.StatRepository;
import com.footballStats.Luian.service.StatService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor	
public class StatServiceImpl implements StatService{

	private StatRepository statRepository;

	@Override
	public List<Stat> getAllStats() {
		return statRepository.findAll();
	}
}
