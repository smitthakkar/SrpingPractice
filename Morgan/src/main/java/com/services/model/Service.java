package com.services.model;

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
public class Service {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="serviceId")
	private long serviceId;
	
	@Column(name="serviceName")
	private String serviceName;
	
	@Column(name="URL")
	private String URL;
	@Column(name="method")
	private String method;
	
	 @OneToMany(fetch=FetchType.LAZY,targetEntity=Parameter.class,cascade=CascadeType.ALL)
	    @JoinTable(name="ParamList" ,joinColumns= { @JoinColumn(name="serviceId") },
	    inverseJoinColumns= {@JoinColumn(name="paramId")})
	private List<Parameter> parameters;
	 
	 @OneToMany(fetch=FetchType.LAZY,targetEntity=AllowedParam.class,cascade=CascadeType.ALL)
	    @JoinTable(name="AllowParamList" ,joinColumns= { @JoinColumn(name="serviceId") },
	    inverseJoinColumns= {@JoinColumn(name="allowId")})
	private List<AllowedParam> allowedParams;
	
	 public Service() {
		// TODO Auto-generated constructor stub
	}
	 
	 
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public List<Parameter> getParameters() {
		return parameters;
	}
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	public List<AllowedParam> getAllowedParams() {
		return allowedParams;
	}
	public void setAllowedParams(List<AllowedParam> allowedParams) {
		this.allowedParams = allowedParams;
	}
	@Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceName=" + serviceName + ", URL=" + URL + ", method="
				+ method + ", parameters=" + parameters + ", allowedParams=" + allowedParams + "]";
	}
	
}
