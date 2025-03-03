package com.srnr.spring.beans;

public class DTDC implements Courier{

	@Override
	public String deliver(int oId) {
		
		return oId+"with that ID item is deliverd by DTDC";
	}

}
