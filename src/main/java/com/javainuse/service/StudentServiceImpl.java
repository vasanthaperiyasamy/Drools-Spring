package com.javainuse.service;

import org.drools.runtime.StatelessKnowledgeSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.javainuse.listeners.CustomAgendaEventListner;
import com.javainuse.model.Student;
@Component("StudentServiceImpl")
public class StudentServiceImpl {
	
	@Autowired
	private ApplicationContext applicationContext;
	public void calculateResult(Student student) {
		StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext
				.getBean("productSession");
		statelessKnowledgeSession.addEventListener(new CustomAgendaEventListner() );
		statelessKnowledgeSession.execute(student);
		
	}

}
