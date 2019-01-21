package com.javainuse.service;

import java.util.List;

import org.drools.command.Command;
import org.drools.command.CommandFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;

import com.javainuse.listeners.CustomAgendaEventListner;
import com.javainuse.listeners.CustomWorkingMemoryEventListener;
import com.javainuse.model.State;

@Component("StateServiceImpl")
public class StateServiceImpl {

	@Autowired
	private ApplicationContext applicationContext;

	public void changeState(List<State> stateList) {

		StatefulKnowledgeSession session = (StatefulKnowledgeSession) applicationContext.getBean("statefulSession");
		session.addEventListener(new CustomAgendaEventListner());
		session.addEventListener(new CustomWorkingMemoryEventListener());
	
		for (State state : stateList) {

			session.insert(state);

		}

		session.fireAllRules();

	}

}
