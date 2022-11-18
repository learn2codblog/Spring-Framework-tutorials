package com.learn2cod.springFrameWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn2cod.first.spring.coding.SpringClassExample1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void springTest1() {
    	  ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
          
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
        
        SpringClassExample1 course = (SpringClassExample1) appCtx.getBean("courseName");  
        
        course.display();
    }
}
