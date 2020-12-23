package com.github.bhborkar.qlearning.healthchecks;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@ApplicationScoped
@Liveness
public class SimpleLivenessCheck implements HealthCheck{

	@Override
	public HealthCheckResponse call() {
		return HealthCheckResponse.up("live");
	}
}
