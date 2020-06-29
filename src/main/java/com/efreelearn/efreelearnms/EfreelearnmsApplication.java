package com.efreelearn.efreelearnms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.efreelearn.routingandfilteringgateway.filters.pre.SimpleFilter;

//@SpringBootApplication
@EnableZuulProxy
public class EfreelearnmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfreelearnmsApplication.class, args);
	}
	@Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }

}
