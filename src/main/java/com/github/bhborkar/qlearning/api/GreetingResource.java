package com.github.bhborkar.qlearning.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.bhborkar.qlearning.config.Configuration;

@Path("/hello")
public class GreetingResource {

	@Inject
	Configuration config;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from " + config.getHelloString();
    }
}