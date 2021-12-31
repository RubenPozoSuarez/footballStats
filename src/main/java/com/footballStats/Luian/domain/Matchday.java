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
@Table(name="t0005_matchday")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Matchday {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="number_matchday")
	private int number;
	
	@OneToOne
	@JoinColumn(name="fk_season")
	private Season season;
	
	private LocalDateTime day;
}
