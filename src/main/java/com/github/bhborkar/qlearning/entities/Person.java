package com.github.bhborkar.qlearning.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.github.bhborkar.qlearning.enums.EyeColor;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {
	// the person's name
	public String name;

	// the person's birthdate
	public LocalDate birth;

	// the person's eye color
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	public EyeColor eyes;

	// TODO: Add more queries

	public static List<Person> findByColor(EyeColor color) {
		return list("eyes", color);
	}
}
