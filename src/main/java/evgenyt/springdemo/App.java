package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring JDBC DAO example
 * PersonDAO class connects Person class with person db table
 * Aug 2019 EvgenyT
 */

public class App 
{
    public static void main( String[] args )
    {
        // Read context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // Get DAO bean
        PersonDAO personDAO = context.getBean("personDAO", PersonDAO.class);
        // Test DAO
        personDAO.insert(new Person("Black Beard"));
    }
}
