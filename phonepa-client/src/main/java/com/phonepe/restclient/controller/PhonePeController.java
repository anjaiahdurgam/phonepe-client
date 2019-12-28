package com.phonepe.restclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonepe.restclient.dto.Payment;
import com.phonepe.restclient.dto.PaymentResponse;
import com.phonepe.restclient.service.PhonePeService;

@RestController
@RequestMapping("/PhonePe")
public class PhonePeController {
	@Autowired
	private PhonePeService service;

	@PostMapping("/payment")
	public PaymentResponse pay(@RequestBody Payment payment) {
		return service.quickPay(payment);
	}

	@GetMapping("/findTransactions/{vendor}")
	public PaymentResponse getPayments(@PathVariable String vendor) {
		return service.getPaymentsByVendor(vendor);
	}
}
