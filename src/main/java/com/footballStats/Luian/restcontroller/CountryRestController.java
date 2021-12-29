package com.footballStats.Luian.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.footballStats.Luian.domain.Country;
import com.footballStats.Luian.service.CountryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/webapi/country")
@AllArgsConstructor
/*@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})*/
public class CountryRestController {
	
	private CountryService countryService;
	
	@GetMapping
	public List<Country> getAllCountries(){
		return countryService.getAllCountries();
	}
}
