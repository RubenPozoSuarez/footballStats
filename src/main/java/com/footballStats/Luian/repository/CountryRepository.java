package com.footballStats.Luian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballStats.Luian.domain.Country;

public interface CountryRepository extends JpaRepository<Country, String>{

}
