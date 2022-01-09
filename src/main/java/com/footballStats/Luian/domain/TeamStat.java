package com.footballStats.Luian.domain;

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
@Table(name="teamstat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamStat {

	@Id
	@GeneratedValue
	private long id;
	
	@OneToOne
	@JoinColumn(name="fk_team")
	private Team team;
	
	@OneToOne
	@JoinColumn(name="fk_stat")
	private Stat stat;
}
