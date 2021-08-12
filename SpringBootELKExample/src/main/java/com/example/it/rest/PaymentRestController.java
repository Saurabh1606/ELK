package com.example.it.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.it.util.AppUtil;

public class PaymentRestController {

	private static final Logger LOG =
			LoggerFactory.getLogger(PaymentRestController.class);
			@GetMapping("/doPay")
			public String doPayment() {
				LOG.info("ENTERED INTO PAYMENT SERVICE");
				try {
				LOG.info("PAYMENT ABOUT TO START!");
				throw new RuntimeException("INVALID OTP !");
				} catch (Exception e) {
				e.printStackTrace();
				LOG.error("PAYMENT ABOUT TO START!");
				LOG.error("Exception - " +

				AppUtil.getLogSupport(e));

				}
				return "SUCCESS";
				
			}
}
