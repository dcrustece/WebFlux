package com.webflux.demo.WebFlux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.webflux.demo.WebFlux.entity.Employee;

import reactor.core.publisher.Mono;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long> {
	Mono<Employee> findByName(String name);
}
