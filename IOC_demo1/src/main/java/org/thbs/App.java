package org.thbs;

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
        ApplicationContext context= new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer=(Customer)context.getBean("customer");
        customer.setCustid(100);
        customer.setCname("varun");

        Address address=(Address)customer.getAddress();
        address.setDoorno("77");
        address.setCity("bengaluru");
        address.setState("karnataka");
        address.setPin("562157");
        address.setStreet("new airport road");

        System.out.println(customer);
    }
}
