package com.all.tools.handler;

import com.all.tools.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class EmployeeHandler {
    @Autowired
    EmployeeService employeeService;

//    public Mono<ServerResponse> getAllEmployees(){
//        return ServerResponse.ok().body(employeeService.getEmployeeList()).
//    }
}
