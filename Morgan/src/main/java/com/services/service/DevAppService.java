package com.services.service;

import java.util.List;

import com.services.model.DevApplication;

public interface DevAppService {

	List<DevApplication> loadAll();
	void SaveAppData(DevApplication d);
	
}
