package com.javainuse.service;

import java.util.List;

import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaEventListener;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.DebugAgendaEventListener;
import org.drools.event.rule.RuleFlowGroupActivatedEvent;
import org.drools.event.rule.RuleFlowGroupDeactivatedEvent;
import org.drools.runtime.StatelessKnowledgeSession;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.javainuse.listeners.CustomAgendaEventListner;
import com.javainuse.model.Product;

@Component("ProductServiceImpl")
public class ProductServiceImpl {

	@Autowired
	private ApplicationContext applicationContext;

	public void CalculateDiscount(List<Product> productList) {

		StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
				.getBean("productSession");
	//	statelessKnowledgeSession.addEventListener();
		//statelessKnowledgeSession.addEventListener(new DebugAgendaEventListener() );
		statelessKnowledgeSession.addEventListener(new CustomAgendaEventListner());
		//statelessKnowledgeSession.addEventListener(new RuleR);
		statelessKnowledgeSession.execute(productList);
		
	}
}
	