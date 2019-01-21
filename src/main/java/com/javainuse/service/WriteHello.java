package com.javainuse.service;

import org.drools.spi.KnowledgeHelper;

public class WriteHello {
	
	public  static void sayHello(KnowledgeHelper drools) {
		System.out.println(" Say Hello "+ drools.getActivation().getSalience());
		
	}

}
