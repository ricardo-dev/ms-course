package com.mscourse.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.mscourse.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		/**
		 *  mockado apenas para teste
		 */
		return new Payment("Bob", 200.0, days);
	}

}
