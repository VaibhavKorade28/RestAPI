package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.app.entities.Category;

public class RailwayReqDto {
	@NotBlank
    private String name;
    private Category category;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
   
    private String source;
   
    private String destination;
    @Min(1)
    private double distance;
    @Min(1)
    private int frequency;
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
	@Override
	public String toString() {
		return "RailwayReqDto [name=" + name + ", category=" + category + ", startTime=" + startTime + ", endTime="
				+ endTime + ", source=" + source + ", destination=" + destination + ", distance=" + distance
				+ ", frequency=" + frequency + "]";
	}
    
}
