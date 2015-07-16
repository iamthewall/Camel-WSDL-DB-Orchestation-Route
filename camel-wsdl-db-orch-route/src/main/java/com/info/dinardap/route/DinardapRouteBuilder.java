package com.info.dinardap.route;
import org.apache.camel.builder.RouteBuilder;

public class DinardapRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		 from("file:in?noop=true")
		 .log("body contents initial: ${body}")
		 .log("body contents final: ${body}");
		 
		
	}

}
