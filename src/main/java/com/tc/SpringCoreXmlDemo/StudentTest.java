package com.tc.SpringCoreXmlDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tc.SpringCoreDemo.beans.Student;



public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)context.getBean("stuone");
         System.out.println(student.getSid());
         System.out.println(student.getName());
         System.out.println(student.getBranch().getBid());
         System.out.println(student.getBranch().getBname());
	
	if(context!=null)
		((AbstractApplicationContext)context).close();
	}

}
