package com.javainuse.listeners;

import org.drools.definition.rule.Rule;
import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaEventListener;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.RuleFlowGroupActivatedEvent;
import org.drools.event.rule.RuleFlowGroupDeactivatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomAgendaEventListner implements AgendaEventListener {
	
	 private static final Logger logger = 
			 LoggerFactory.getLogger(CustomAgendaEventListner.class);
	 

	public void activationCreated(ActivationCreatedEvent event) {
		// TODO Auto-generated method stub
	Rule rule =event.getActivation().getRule();
		logger.info("Rule name :"+rule.getName());
	}

	public void activationCancelled(ActivationCancelledEvent event) {
		// TODO Auto-generated method stub
		logger.info(event.getActivation().toString());
		
	}

	public void beforeActivationFired(BeforeActivationFiredEvent event) {
		// TODO Auto-generated method stub
		logger.info(event.getActivation().toString());
		
	}

	public void afterActivationFired(AfterActivationFiredEvent event) {
		// TODO Auto-generated method stub
	
		logger.info(event.getActivation().toString());
	}

	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
		// TODO Auto-generated method stub
	//	logger.info(+event.getKnowledgeRuntime());
	}

	public void agendaGroupPushed(AgendaGroupPushedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	

}
