package com.footballStats.Luian.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t0001_country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	@JsonIgnore
	@OneToMany
	private List<Team> teams = new ArrayList<Team>();
}