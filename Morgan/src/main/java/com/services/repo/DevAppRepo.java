package com.services.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.services.model.DevApplication;

public interface DevAppRepo extends JpaRepository<DevApplication,Long> {

	List<DevApplication> findByValEquals(String val);
}
