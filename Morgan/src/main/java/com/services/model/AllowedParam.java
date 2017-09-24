package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllowedParam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="allowId")
	private long allowId;
	
	@Column(name="Name")
	private String Name;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	@Column(name="Type")
	private String Type;
	
	@Column(name="Location")
	private String Location;
	
	public AllowedParam() {
		// TODO Auto-generated constructor stub
	}
	public AllowedParam(String Name,String Type,String Location){
		this.Name=Name;this.Type=Type;
		this.Location=Location;
	}

	@Override
	public String toString() {
		return "AllowedParam [allowId=" + allowId + ", Name=" + Name + ", Type=" + Type + ", Location=" + Location
				+ "]";
	}
	public long getAllowId() {
		return allowId;
	}

	public void setAllowId(long allowId) {
		this.allowId = allowId;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}
	
	
}
