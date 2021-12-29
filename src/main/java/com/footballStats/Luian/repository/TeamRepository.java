package com.footballStats.Luian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballStats.Luian.domain.Team;

public interface TeamRepository extends JpaRepository<Team, String>{

}
