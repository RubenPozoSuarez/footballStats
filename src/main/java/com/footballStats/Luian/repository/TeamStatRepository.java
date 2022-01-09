package com.footballStats.Luian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballStats.Luian.domain.TeamStat;

public interface TeamStatRepository extends JpaRepository<TeamStat, String>{

}
