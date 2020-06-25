package com.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drools.model.Order;

@RestController
public class MegaOfferContoller {

	@Autowired
	private KieSession session;

	@PostMapping(value = "/order")
	public Order OrderNow(@RequestBody Order order) {

		session.insert(order);
		session.fireAllRules();

		return order;
	}

}
