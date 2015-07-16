package com.info.dinardap.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(name = "DinardapService")
public interface DinardapService {

	@WebMethod(operationName = "validar")
	public String validar(@WebParam(name="irc")String irc, @WebParam(name="cedula")String cedula);
}
