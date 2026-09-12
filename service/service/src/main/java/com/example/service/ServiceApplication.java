package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Bean
	RouterFunction <ServerResponse> myRoutes(){
		return route ()
				.GET("/customers", new HandlerFunction<ServerResponse>(){
					@Override
					public ServerResponse handle(ServerRequest request) throws
				})
				.build()
	}
}

record Customer (int id, String Name) {

}
interface CustomerRepository extends ListCrudRepository<Customer, Integer> {

}
