package org.thbs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        address adrs = new address();
        adrs.setDoorno("77");
        adrs.setStreet("new airport road");
        adrs.setCity("bengaluru");
        adrs.setState("karnataka");
        adrs.setPin("562157");

       customer cust = new customer();
       cust.setCustid(007);
       cust.setCname("varun");
       cust.setCaddress(adrs);

        System.out.println(cust);
    }
}
