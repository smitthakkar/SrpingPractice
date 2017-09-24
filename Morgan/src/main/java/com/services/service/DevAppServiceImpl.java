package com.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.model.DevApplication;
import com.services.repo.DevAppRepo;

@Service
public class DevAppServiceImpl implements DevAppService {

	@Autowired
     private DevAppRepo devAppRepo;

	public List<DevApplication> loadAll() {
		
		return devAppRepo.findAll() ;
	}

	public void SaveAppData(DevApplication d) {
		
		if(devAppRepo.findByValEquals(d.getVal()) != null)
		devAppRepo.delete(d);
		devAppRepo.save(d);
		
	}
	
	
	
	
	
}
