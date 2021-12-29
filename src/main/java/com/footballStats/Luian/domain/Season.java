package com.footballStats.Luian.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t0004_season")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Season {
	@Id
	@GeneratedValue
	private long id;
	
	private LocalDateTime date_start;
	
	private LocalDateTime date_end;
	
	@ManyToOne
	@JoinColumn(name="fk_competition")
	private Competition competition;
}
