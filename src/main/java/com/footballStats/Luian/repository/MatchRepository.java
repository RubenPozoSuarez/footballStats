package com.footballStats.Luian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballStats.Luian.domain.Matches;

public interface MatchRepository extends JpaRepository<Matches, String>{

}
