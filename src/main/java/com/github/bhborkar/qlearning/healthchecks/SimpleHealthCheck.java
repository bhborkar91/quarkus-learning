package com.github.bhborkar.qlearning.healthchecks;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@ApplicationScoped
@Readiness
public class SimpleHealthCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
    	return HealthCheckResponse.up("simple health check");
    }
}