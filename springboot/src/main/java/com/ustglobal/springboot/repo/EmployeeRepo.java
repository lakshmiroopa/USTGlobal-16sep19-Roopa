package com.ustglobal.springboot.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ustglobal.springboot.dto.EmployeeBean;

public interface EmployeeRepo extends JpaRepository<EmployeeBean,Integer> {

	@Transactional
	@Modifying
	@Query("update EmployeeBean set name=:name, email=:email, password=:password, doj=:doj,gender=:gender where id=:id")
	public void update(String name,String email,String password,Date doj,String gender,int id);
	
	//public EmployeeBean findByName(String name);
	
	//public void deleteByName(String name);
}

