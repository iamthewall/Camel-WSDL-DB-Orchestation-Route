package com.info.dinardap.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.info.dinardap.sei.xsd.Validar;
import com.info.dinardap.sei.xsd.ValidarResponse;




public class DinardapProcessor implements Processor {


	private Logger logger = Logger.getLogger(getClass());
    
	@Override
	public void process(Exchange exchange) throws Exception {

		logger.debug("-------DinardapProcessor-----");
		Message in = exchange.getIn();
		
		//Debe venir un objeto de este tipo!
		
		Validar body = (Validar) in.getBody(); //NO LA NECESITO POR AHORA. 
		ValidarResponse response = new ValidarResponse();
		response.setReturn("CHECKED! -->"+body.getCedula()); //esto es lo que falta alterar 
		exchange.getOut().setBody(response);
		
		
	}

}
