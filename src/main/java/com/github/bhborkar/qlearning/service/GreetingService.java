package com.github.bhborkar.qlearning.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.github.bhborkar.qlearning.config.Configuration;

@ApplicationScoped
public class GreetingService {

	@Inject
	Configuration config;

	public String greet() {
		return "Hello from " + config.getHelloString();
	}
}
