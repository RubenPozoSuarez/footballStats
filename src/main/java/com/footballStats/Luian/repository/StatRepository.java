package com.footballStats.Luian.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.footballStats.Luian.domain.Stat;

public interface StatRepository extends JpaRepository<Stat, String> {

}
