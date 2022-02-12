package com.mscourse.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mscourse.hrpayroll.entities.Payment;
import com.mscourse.hrpayroll.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(method=RequestMethod.GET, value="/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable("workerId") Long workerId, @PathVariable("days") Integer days){
		Payment payment = this.paymentService.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}

}
