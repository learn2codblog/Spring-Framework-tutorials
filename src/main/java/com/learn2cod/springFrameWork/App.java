package com.learn2cod.springFrameWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn2cod.first.spring.coding.SpringClassExample1;  

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Resource resource = new ClassPathResource("applicationContext.xml");
        
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
        
        SpringClassExample1 course = (SpringClassExample1) appCtx.getBean("courseName");  
        
        course.display();
        
     }
    
}
