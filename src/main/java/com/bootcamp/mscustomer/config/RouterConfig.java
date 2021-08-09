package com.bootcamp.mscustomer.config;

import com.bootcamp.mscustomer.handler.CustomerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

public class RouterConfig {
    @Bean
    public RouterFunction<ServerResponse> rutas(CustomerHandler handler){
        return route(GET("/customer"), handler::findAll)
                .andRoute(GET("/customer/{id}"), handler::findById)
                .andRoute(DELETE("/customer/identity/{identityNumber}"), handler::findByCustomerIdentityNumber)
                .andRoute(POST("/customer"), handler::save)
                .andRoute(POST("/customer/update"), handler::update);
    }
}
