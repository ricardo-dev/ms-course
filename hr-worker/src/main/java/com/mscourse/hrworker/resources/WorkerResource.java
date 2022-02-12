package com.mscourse.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hrworker.entities.Worker;
import com.mscourse.hrworker.services.WorkerService;

@RestController
@RequestMapping("/workers")
public class WorkerResource {
	
	@Autowired
	private WorkerService workerService;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public ResponseEntity<Worker> findById(@PathVariable("id") Long id){
		Optional<Worker> obj = workerService.findById(id);
		return obj.isPresent() ? ResponseEntity.ok(obj.get()) : ResponseEntity.notFound().build();
	}
}
