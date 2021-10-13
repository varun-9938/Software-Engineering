package thbs.MyIOCAnotationDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack1.Address;
import pack1.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("pack1");
        context.refresh();
        
        Customer cust = (Customer)context.getBean("customer");
        cust.setCustid("100");
        cust.setCustname("Ragnar");
        Address adrs = cust.getAddress();
        adrs.setDoorNo(77);
        adrs.setCity("Bengaluru");
        adrs.setPincode(562157);
        adrs.setState("Karnataka");
        adrs.setStreet("near airport");
        
        System.out.println(cust);
        context.close();
        
        
    }
}
