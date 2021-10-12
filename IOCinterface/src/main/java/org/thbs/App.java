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
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        THclient c1 = (THclient) context.getBean("client1");
        System.out.println(c1.deposit(1234L,10000));
        System.out.println();
        System.out.println(c1.withdraw(1234,4000));
        System.out.println();
        System.out.println(c1.getBalance(1234));
    }
}