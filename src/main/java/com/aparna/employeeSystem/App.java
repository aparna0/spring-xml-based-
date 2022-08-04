package com.aparna.employeeSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Department dept = (Department)context.getBean("department");
        System.out.println(dept);
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp);
    }
}
