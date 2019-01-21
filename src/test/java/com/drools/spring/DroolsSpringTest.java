package com.drools.spring;


	import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.drools.event.KnowledgeRuntimeEventManager;
import org.drools.event.rule.WorkingMemoryEventListener;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javainuse.listeners.CustomAgendaEventListner;
import com.javainuse.listeners.CustomWorkingMemoryEventListener;
import com.javainuse.model.Product;
import com.javainuse.model.State;
import com.javainuse.model.Student;
import com.javainuse.service.ProductServiceImpl;
import com.javainuse.service.StateServiceImpl;
import com.javainuse.service.StudentServiceImpl;

	public class DroolsSpringTest {

		public static void main(String args[]) {
			/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
					"applicationContext.xml");
			ProductServiceImpl bean = ((ProductServiceImpl) applicationContext
					.getBean("ProductServiceImpl"));
			
			StudentServiceImpl stuBean = ((StudentServiceImpl) applicationContext
					.getBean("StudentServiceImpl"));

			Product product = new Product();
			product.setType("gold");

			bean.CalculateDiscount(product);

			showDiscount(product);
			
			Student stu1=new Student();
			
			stu1.setMark(25);
			stuBean.calculateResult(stu1);
			System.out.println(" Result "+ stu1.getResult());
			Student stu2=new Student();
			
			stu2.setMark(50);
			stuBean.calculateResult(stu2);
			System.out.println(" Pass Result "+ stu2.getResult());*/
			
		}

		private static void showDiscount(Product product) {
			System.out.println("The discount is " + product.getDiscount());
		}
		
		 @Test
		public  void  unitTest() {
			 ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
						"applicationContext.xml");
			 
			    //Stateless Example
			 /*ProductServiceImpl bean = ((ProductServiceImpl) applicationContext
						.getBean("ProductServiceImpl"));
				
				StudentServiceImpl stuBean = ((StudentServiceImpl) applicationContext
						.getBean("StudentServiceImpl"));

				Product product = new Product();
				product.setType("gold");

				Product product1 = new Product();
				product1.setType("diamond");
				
				List<Product> productList=new ArrayList<Product>();
				productList.add(product);
				productList.add(product1);

				bean.CalculateDiscount(productList);

				showDiscount(product);
				showDiscount(product1);
				
				Student stu1=new Student();
				
				stu1.setMark(25);
				stuBean.calculateResult(stu1);
				System.out.println(" Result "+ stu1.getResult());
				Student stu2=new Student();
				
				stu2.setMark(50);
				stuBean.calculateResult(stu2);
				System.out.println(" Pass Result "+ stu2.getResult());
				assertNotNull(stu2.getResult());*/
			 
			  //Stateful Example
			 
			
			 	applicationContext.getBeanDefinitionNames();
			 	StateServiceImpl stateServiceImpl=((StateServiceImpl)applicationContext.getBean("StateServiceImpl"));

			 	
			 	List<State> stateList=new ArrayList<State>();
			 	
				
				State A=new State("A");
				stateList.add(A);
				State B=new State("B");
				stateList.add(B);
				State C=new State("C");
				stateList.add(C);
				State D=new State("D");
				stateList.add(D);
				
				stateServiceImpl.changeState(stateList);
				
				
				
				/*StatefulKnowledgeSession session=(StatefulKnowledgeSession)applicationContext.getBean("statefulSession");
				// KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger((KnowledgeRuntimeEventManager)session, "test1");
				 KnowledgeRuntimeLogger logger1= KnowledgeRuntimeLoggerFactory.newConsoleLogger((KnowledgeRuntimeEventManager)session);
				session.addEventListener(new CustomAgendaEventListner());
				session.addEventListener(new CustomWorkingMemoryEventListener());
				
				session.insert(A);
				session.insert(B);
				session.insert(C);
				session.insert(D);
				session.fireAllRules();
			//	logger.close();
				session.dispose(); */
				
			
		}
	}