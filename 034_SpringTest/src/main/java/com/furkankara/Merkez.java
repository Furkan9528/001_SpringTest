package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appCtx = 
				new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
			
		Memur memur = appCtx.getBean("memurBean",Memur.class);
		memur.calis();
		
		
		
	}

}
