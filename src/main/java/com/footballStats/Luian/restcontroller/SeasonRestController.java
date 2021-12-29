package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Season;
import com.footballStats.Luian.service.SeasonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/season")
@AllArgsConstructor
public class SeasonRestController {

	private SeasonService seasonService;
	
	@GetMapping
	private List<Season> getAllSeasons(){
		return seasonService.getAllSeasons();
	}
}
