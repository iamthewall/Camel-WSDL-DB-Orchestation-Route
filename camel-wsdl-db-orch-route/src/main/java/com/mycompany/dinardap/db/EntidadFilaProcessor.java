package com.mycompany.dinardap.db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class EntidadFilaProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception 
	{
			ArrayList<LinkedHashMap<String, Object>> resultado = exchange.getIn().getBody(ArrayList.class);
			
			for (LinkedHashMap<String, Object> fila: resultado )
			{
			    Iterator it = fila.entrySet().iterator();
			    while (it.hasNext()) {
			        Map.Entry pair = (Map.Entry)it.next();
			        System.out.println(pair.getKey() + " = " + pair.getValue());
			        it.remove(); // avoids a ConcurrentModificationException
			    }				
			}
	}

}
