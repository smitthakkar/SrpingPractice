package com.services.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class DevApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="aid")
	private long aid;
	
	@Override
	public String toString() {
		return "DevApplication [aid=" + aid + ", val=" + val + ", roles=" + roles + ", services=" + services
				+ ", description=" + description + "]";
	}
	@Column(name="value")
	private String val;
	
    @OneToMany(fetch=FetchType.LAZY,targetEntity=Role.class,cascade=CascadeType.ALL)
    @JoinTable(name="Approle" ,joinColumns= { @JoinColumn(name="aid") },
    inverseJoinColumns= {@JoinColumn(name="roleCId")})
	private List<Role> roles = new ArrayList<Role>();
    
    @OneToMany(fetch=FetchType.LAZY,targetEntity=Service.class,cascade=CascadeType.ALL)
    @JoinTable(name="AppService" ,joinColumns= { @JoinColumn(name="aid") },
    inverseJoinColumns= {@JoinColumn(name="serviceId")})
    private List<Service> services = new ArrayList<Service>();
    
    @Column(name="description")
    private String description;
    
	
	
	public DevApplication() {}
	
	
	
    
    public List<Role> getRoles() {
		return roles;
	}


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}


	public List<Service> getServices() {
		return services;
	}


	public void setServices(List<Service> services) {
		this.services = services;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}

	
	
}
