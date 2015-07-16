package com.info.dinardap.sei;

public class DinardapServiceImp implements DinardapService{

	@Override
	public String validar(String irc, String cedula) {
		return irc + " - " + cedula;
	}

}
