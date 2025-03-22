package com.all.tools.router;

import com.all.tools.handler.EmployeeHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Router {

//    public RouterFunction<ServerResponse> route(ServerRequest serverRequest){
//        return RouterFunctions.route().GET("/employee", EmployeeHandler:: getAllEmployees).build();
//    }
}
