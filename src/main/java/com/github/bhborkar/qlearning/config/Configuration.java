package com.github.bhborkar.qlearning.config;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class Configuration {

	@ConfigProperty(name = "greeting.hello")
	String helloString;
	
	public String getHelloString() {
		return helloString;
	}
}
