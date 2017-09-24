package com.services.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Role {

	@Override
	public String toString() {
		return "Role [roleCId=" + roleCId + ", roleName=" + roleName + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name="roleCId")
	private long roleCId;
	
	@Column(name="roleName")
	private String roleName;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	public Role(String role){
		this.roleName=role;
	}

	public long getRoleCId() {
		return roleCId;
	}

	public void setRoleCId(long roleCId) {
		this.roleCId = roleCId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
