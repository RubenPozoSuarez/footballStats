package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.TeamStat;
import com.footballStats.Luian.service.TeamStatService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/teamStat")
@AllArgsConstructor
public class TeamStatRestController {
	
	private TeamStatService teamStateService;
	
	@GetMapping
	public List<TeamStat> getAllTeamStat(){
		return teamStateService.getAllTeamStat();
	}
}
