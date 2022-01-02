package com.footballStats.Luian.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t0007_stat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Stat {
	@Id
	@GeneratedValue
	private long id;
	
	private int possesion;
	private int foul;
	@Column(name="shot_of_goal")
	private int shotOfGoal;
	private int offside;
	private int corner;
	private int goal;
}
