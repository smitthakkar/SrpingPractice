package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parameter {

	@Override
	public String toString() {
		return "Parameter [paramId=" + paramId + ", Name=" + Name + ", Type=" + Type + ", DefaultValue=" + DefaultValue
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="paramId")
	private long paramId;
	
	@Column(name="Name")
	private String Name;
	@Column(name="Type")
	private String Type;
	@Column(name="DefaultVal")
	private String DefaultValue;
	
	public Parameter() {
		// TODO Auto-generated constructor stub
	}
   public Parameter(String Name,String Type,String DefaultVal){
	   this.Name=Name;
	   this.Type=Type;
	   this.DefaultValue=DefaultVal;
   }
	public long getParamId() {
		return paramId;
	}

	public void setParamId(long paramId) {
		this.paramId = paramId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDefaultValue() {
		return DefaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		DefaultValue = defaultValue;
	}
	
	
}
