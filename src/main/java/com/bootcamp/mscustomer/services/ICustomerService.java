package com.bootcamp.mscustomer.services;

import com.bootcamp.mscustomer.models.entities.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerService {
    public Flux<Customer> findAll();

    public Mono<Customer> findById(String id);

    public Mono<Customer> save(Customer customer);

    public Mono<Customer> update(String id, Customer message);

    public Mono<Void> delete(Customer customer);
}