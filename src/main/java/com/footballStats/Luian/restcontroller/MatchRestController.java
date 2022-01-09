package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Matches;
import com.footballStats.Luian.service.MatchService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/match")
@AllArgsConstructor
public class MatchRestController {
	
	private MatchService matchService;
	
	@GetMapping
	public List<Matches> getAllMatches(){
		return matchService.getAllMatches();
	}
}
