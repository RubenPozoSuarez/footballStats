package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Stat;
import com.footballStats.Luian.service.StatService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/stat")
@AllArgsConstructor
public class StatRestController {
	
	private StatService statService;
	
	@GetMapping
	public List<Stat> getAllStats(){
		return statService.getAllStats();
	}
}
