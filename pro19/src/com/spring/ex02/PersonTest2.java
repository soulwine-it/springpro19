package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest2 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		//id가 personService1인 빈을 가져옵니다.
		PersonService person1 = (PersonService) factory.getBean("personService1");
		//bean의 sayHello()를 호출합니다.
		person1.sayHello();
		System.out.println();
		
		//id가 personService2인 빈을 가져옵니다.
		PersonService person2 = (PersonService) factory.getBean("personService2");
		person2.sayHello();
	}
}
