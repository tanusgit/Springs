package practice;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanCreationException;
/*
 * 
    Right click on your project, then open Properties
    Java build path
    Click on Add Library
    Choose JRE system library
    Click on environments and choose JAVA SE 1.8
    After that, I removed JAVA SE 10 from my build path and everything becomes right.

 */
/*
 * logger error:
 * 

It looks like you need to add the location of your log4j.properties file to the Classpath in Eclipse.

Make sure your project is open in Eclipse, then click on the "Run" menu at the top of Eclipse and click on the following:

    Run
    Run Configurations
    Classpath (tab)
    User Entries
    Advanced (button on the right)
    Add Folders
    then navigate to the folder that contains your log4j.properties file
    Apply
    Run

The error message should no longer appear.

 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) throws BeanCreationException{
		Employee m = new Employee();
		m.setId(1);
		m.setName("John");
		m.setSalary(52364);
		System.out.println("using POJO");
		System.out.println(m);
		System.out.println("***********************************");
		// Add jar files for Spring core
		// configure java object in an xml file
		// Use Spring IOC container. ex. BeanFactory or ApllicationContext to get
		// the objects constructed by them
		ApplicationContext context = new ClassPathXmlApplicationContext("Emp.xml");
		//approach1
		Employee e1 = (Employee)context.getBean("emp1");
		//approach2
		Employee e2 = context.getBean("emp2", Employee.class);
		System.out.println("usinf Spring IOC: Inversion of Controll");
		System.out.println(e1);
		System.out.println(e2);
		//BasicConfigurator.configure();
		//String log1 = "/home/td/Desktop/Java/log4j.properties";
		//PropertyConfigurator.configure(log1);
		
	}
}
