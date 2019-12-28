package com.phonepe.restclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonepe.restclient.dto.Payment;
import com.phonepe.restclient.dto.PaymentResponse;
import com.phonepe.restclient.locator.RuleUtil;

@Service
public class PhonePeService {
	@Autowired
	private RuleUtil util;

	public PaymentResponse quickPay(Payment payment) {
		return util.processPayment(payment);
	}

	public PaymentResponse getPaymentsByVendor(String vendor) {
		return util.getTransaction(vendor);
	}
}
