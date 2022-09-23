package io.eronalves1996.spring.dependencyCheckInnerBeansScopeExercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"io/eronalves1996/spring/dependencyCheckInnerBeansScopeExercise/config.xml");
		University bean = (University) ctx.getBean("university");
		System.out.println(bean.hashCode());
		
		University bean2 = (University) ctx.getBean("university");
		System.out.println(bean2.hashCode());

	}

}
