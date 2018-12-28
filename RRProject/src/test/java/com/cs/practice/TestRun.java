package com.cs.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cs.DependencyCheck.Child;
import com.cs.DependencyCheck.Parent;

public class TestRun {

	public static void main(String[] args) {
		/*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cs/resource/beanFactory.xml"));
		
  		factory.getBean("employee", DepartMent.class);

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/cs/resource/beanFactory.xml");
		Source source = factory.getBean("source", Source.class);		
		source.throwEvent(); 
		
		*/
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/cs/resource/beanFactory.xml"));
		factory.getBean("parent", Parent.class);
		factory.getBean("child", Child.class);
	}

}
