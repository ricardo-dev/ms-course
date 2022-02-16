package com.mscourse.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mscourse.hrpayroll.entities.Worker;



@Component
@FeignClient(name="hr-worker", url="localhost:8001", path = "/workers") // name = projeto.resources.application.properties.spring.application.name
public interface WorkerFeignClient {
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	ResponseEntity<Worker> findById(@PathVariable("id") Long id); // chamada iqual ao worker resource

}
