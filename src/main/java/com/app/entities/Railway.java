package com.app.entities;

import java.time.LocalDateTime;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="railways")
public class Railway extends BaseEntity {
     @Column(length=20,nullable = false)
     private String name;
     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private Category category;
     @Column(nullable = false)
     private LocalDateTime startTime;
     @Column(nullable = false)
     private LocalDateTime endTime;
     @Column(length=20,  nullable = false)
     private String source;
     @Column(length=20,  nullable = false)
     private String destination;
     @Column(nullable = false)
     private double distance;
     @Column(nullable = false)
     private int frequency;
	public Railway() {
		super();
	}
	public Railway(String name, Category category, LocalDateTime startTime, LocalDateTime endTime, String source,
			String destination, double distance, int frequency) {
		super();
		this.name = name;
		this.category = category;
		this.startTime = startTime;
		this.endTime = endTime;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.frequency = frequency;
	}
	@Override
	public String toString() {
		return "Railway [name=" + name + ", category=" + category + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", source=" + source + ", destination=" + destination + ", distance=" + distance + ", frequency="
				+ frequency + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
     
}
