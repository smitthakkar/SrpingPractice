package com.services.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.services.model.AllowedParam;
import com.services.model.DevApplication;
import com.services.model.Parameter;
import com.services.model.Role;
import com.services.model.Service;
import com.services.service.DevAppService;

@RestController
public class DevApplicationController {

	@Autowired
	private DevAppService devAppService;

	@RequestMapping("/findAll")
	public String loadAll() {
		String output = "";
		List<DevApplication> l = devAppService.loadAll();
		for (DevApplication d : l) {
			output += "\n" + d.toString();
		}
		return output;
	}

	@RequestMapping("/save")
	public String saveData(@RequestParam("val")String val) {

		
		DevApplication d= new DevApplication();
		
		List<Role> roles=new ArrayList<Role>();
		roles.add(new Role("Admin"));
		
		List<Service> services=new ArrayList<Service>();
		Service s1= new Service();
		s1.setServiceName("Service1");
		s1.setURL("http://www.abc.com");
		s1.setMethod("GET");
		
		List<Parameter> parameters=new ArrayList<Parameter>();
		parameters.add(new Parameter("abc","String","pqr"));
		s1.setParameters(parameters);
		
		List<AllowedParam> allowedParams=new ArrayList<AllowedParam>();
		allowedParams.add(new AllowedParam("fgh","String","Party.location"));
		s1.setAllowedParams(allowedParams);
		services.add(s1);
		
		d.setDescription("WorkFlowApp");
		d.setRoles(roles);
		d.setServices(services);
		d.setVal("PWM Workflow");
	
		
		
		
		
		System.out.println(val);
		try {
		devAppService.SaveAppData(d);
		return "success";
		}
		catch(Exception e){
			return e.getMessage();
		}
		

	}
}
