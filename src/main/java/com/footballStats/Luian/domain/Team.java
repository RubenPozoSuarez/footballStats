package com.footballStats.Luian.domain;

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
@Table(name="team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="fk_country")
	private Country country;
}
