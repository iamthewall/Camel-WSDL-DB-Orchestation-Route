package com.info.dinardap.route;

import org.apache.camel.builder.RouteBuilder;


public class DinardapRoute extends RouteBuilder 
{
 	@Override
	public void configure() throws Exception {       
	
		from("cxf:bean:DinardapServiceEndpoint").id("dinardapService")
		     .log("inicio")
		     .to("dinardapProcessor")
		     .end();
		
		
	}
}
