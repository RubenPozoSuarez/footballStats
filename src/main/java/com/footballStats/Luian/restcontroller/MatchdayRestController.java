package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Matchday;
import com.footballStats.Luian.service.MatchdayService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/matchday")
@AllArgsConstructor
public class MatchdayRestController {
	
	private MatchdayService matchdayService;
	
	@GetMapping
	public List<Matchday> getAllMatchdays(){
		return matchdayService.getAllMatchdays();
	}
}
