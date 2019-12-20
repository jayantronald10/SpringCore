package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.MessageWriter;

public class StrategySpringTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/ss/common/application-context.xml"));
		MessageWriter messageWriter = beanFactory.getBean("messageWriter", MessageWriter.class);
		messageWriter.writeMessage(" Message");
	}
}