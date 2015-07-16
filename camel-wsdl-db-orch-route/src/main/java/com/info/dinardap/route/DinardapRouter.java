package com.info.dinardap.route;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

import javax.xml.ws.Endpoint;

import com.info.dinardap.sei.DinardapServiceImp;

public class DinardapRouter {

	public static void main(String[] args  ) throws Throwable
	{
		CamelContext context = new DefaultCamelContext();
		Endpoint endpoint = Endpoint.publish("http://localhost:9000/order", new DinardapServiceImp());
		context.start();
		context.addRoutes(new DinardapRouteBuilder());
		Thread.sleep(10000);
		context.stop();
		endpoint.stop();
	}
}
