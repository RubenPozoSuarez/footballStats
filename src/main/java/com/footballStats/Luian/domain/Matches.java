package com.footballStats.Luian.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t0006_match")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matches {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="date_start")
	private LocalDateTime start;
	@Column(name="date_end")
	private LocalDateTime end;
	
	@OneToOne
	@JoinColumn(name="fk_team_local")
	private Team localTeam;
	
	@OneToOne
	@JoinColumn(name="fk_team_visitor")
	private Team visitorTeam;
	
	@OneToOne
	@JoinColumn(name="fk_local_stat")
	private Stat localStat;
	
	@OneToOne
	@JoinColumn(name="fk_visitor_stat")
	private Stat visitorStat;
	
	@OneToOne
	@JoinColumn(name="fk_matchday")
	private Matchday matchday;
}
