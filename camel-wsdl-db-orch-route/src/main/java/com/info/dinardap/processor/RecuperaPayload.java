package com.info.dinardap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.info.dinardap.processor.Constantes;
import com.info.dinardap.processor.Store;


public class RecuperaPayload implements Processor {

	private static final Logger log = LoggerFactory
			.getLogger(RecuperaPayload.class);
	
	@Autowired
	private Store store;

	@Override
	public void process(Exchange exchange) throws Exception {

	
//		exchange.getIn().setBody((String)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD), String.class);
//		exchange.setIn((Message)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD));
//		exchange = (Exchange)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD);
		
		Message inputExchange = exchange.getIn();
		Message inputGuardada = (Message)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD);
		
		inputExchange.setBody(inputGuardada.getBody());
		inputExchange.setHeaders(inputGuardada.getHeaders());
		
		
		
//		exchange.setOut((Message)store.loadObject(Constantes.VARIABLE_IN_PAYLOAD));
		
		log.info("Se recupero variable payload");
//		log.debug( exchange.getIn().getBody(String.class) );
		}

}
