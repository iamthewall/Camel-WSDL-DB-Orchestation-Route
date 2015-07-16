package com.info.dinardap.processor;

import java.util.HashMap;
import java.util.Map;


/*
 * ESTA CLASE GUARDA HUSTORIA EN LA RUTA
 */
public class Store {
	private Map<String, Object> store;
	
	public Store()
	{
		store = new HashMap<String, Object>();
	}
	
	public void saveObject(String key, Object stuff)
	{
		store.put(key, stuff);
	}

	public Object loadObject(String key)
	{
		return store.get(key);
	}
}
