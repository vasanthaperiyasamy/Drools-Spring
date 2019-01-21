package com.javainuse.listeners;

import org.drools.event.rule.ObjectInsertedEvent;
import org.drools.event.rule.ObjectRetractedEvent;
import org.drools.event.rule.ObjectUpdatedEvent;
import org.drools.event.rule.WorkingMemoryEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomWorkingMemoryEventListener implements WorkingMemoryEventListener {
	private static final Logger logger = 
			 LoggerFactory.getLogger(CustomWorkingMemoryEventListener.class);
	public void objectInserted(ObjectInsertedEvent event) {
		// TODO Auto-generated method stub
		logger.info(" objectInserted ..."+event.getFactHandle().toExternalForm());
		logger.info(" objectInserted ..."+event.getKnowledgeRuntime());
		logger.info(" objectInserted ..."+event.getPropagationContext());
	}

	public void objectUpdated(ObjectUpdatedEvent event) {
		// TODO Auto-generated method stub
		logger.info(" ObjectUpdatedEvent ..."+event.getFactHandle().toExternalForm());
		
	}

	public void objectRetracted(ObjectRetractedEvent event) {
		// TODO Auto-generated method stub
		logger.info(" objectRetracted ..."+event.getFactHandle().toExternalForm());
		
	}

}
