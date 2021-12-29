package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Team;
import com.footballStats.Luian.service.TeamService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/team")
@AllArgsConstructor
public class TeamRestController {

	private TeamService teamService;
	
	@GetMapping
	public List<Team> getAllTeams(){
		return teamService.getAllTeams();
	}
}
