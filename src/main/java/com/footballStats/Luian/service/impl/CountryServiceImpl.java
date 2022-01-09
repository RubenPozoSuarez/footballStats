package com.footballStats.Luian.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.footballStats.Luian.domain.Country;
import com.footballStats.Luian.repository.CountryRepository;
import com.footballStats.Luian.service.CountryService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class CountryServiceImpl implements CountryService {

	private CountryRepository countryRepository;
	
	public List<Country> getAllCountries() {
		return countryRepository.findAll();
	}

}
