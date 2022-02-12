package com.mscourse.hrworker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscourse.hrworker.entities.Worker;
import com.mscourse.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository repository;
	

	public List<Worker> findAll(){
		return repository.findAll();
	}
	
	public Optional<Worker> findById(Long id){
		return repository.findById(id);
	}
}
