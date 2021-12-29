package com.footballStats.Luian.domain;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="t0003_competition")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Competition {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name_competition")
	private String name;
	@Column(name="type_competition")
	private String type;
	
	@JsonIgnore
	@OneToMany
	private List<Season> seasons;
}
