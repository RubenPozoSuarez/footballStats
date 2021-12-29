package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Competition;
import com.footballStats.Luian.service.CompetitionService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/competition")
@AllArgsConstructor
public class CompetitionRestController {
	private CompetitionService competitionService;
	
	@GetMapping
	public List<Competition> getAllCompetitions(){
		return competitionService.getAllCompetitions();
	}
}
