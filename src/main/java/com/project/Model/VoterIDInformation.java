package com.project.Model;

import javax.persistence.Entity;

@Entity
public class VoterIDInformation {
	
	private Integer Id;
	private String Name;
	private String City;
	private String State;
	private int pin;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "VoterIDInformation [Id=" + Id + ", Name=" + Name + ", City=" + City + ", State=" + State + ", pin="
				+ pin + "]";
	}
	public VoterIDInformation(Integer id, String name, String city, String state, int pin) {
		super();
		Id = id;
		Name = name;
		City = city;
		State = state;
		this.pin = pin;
	}
	
	
	
	
}
