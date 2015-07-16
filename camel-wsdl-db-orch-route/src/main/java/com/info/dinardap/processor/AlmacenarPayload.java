package com.info.dinardap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.info.dinardap.processor.Constantes;
import com.info.dinardap.processor.Store;

public class AlmacenarPayload implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(AlmacenarPayload.class);
	
	@Autowired
	private Store store;
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
//		store.saveObject(Constantes.VARIABLE_IN_PAYLOAD, exchange.copy());
		store.saveObject(Constantes.VARIABLE_IN_PAYLOAD, exchange.getIn());
//		log.info("Almacena payload: fileContents =\n " + exchange.getIn().getBody(String.class));
		log.info("Almacena payload: fileContents =\n ");
		
		
	}

}
