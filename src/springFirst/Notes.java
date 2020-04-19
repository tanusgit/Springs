package springFirst;

public class Notes {
/*
 *A project is develope dusing a layered architecture
every layer is independent .
  
	UI 	    ------>          	 Presentation      		------>		       Service layer   	------>	       Integration Layer     	------>	     	DAO Layer    ------> 			     DB layer
          <------															  	<------                           <------                              <------                     <------
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Front end develpment         -Request capturing																																		data storage and maintain
web pages development        -req validation																																	maintain tables, stores pro,funtion
																							
web pages development        -req validation
events handling              -req deligation
                             -response preparation
                             -acts as bridge between web pages
                             and java app
                         
tech:						  tech:
html                          servlets + jsp OR
java scipt                    struts  OR
jquery                        springs mvc OR
css                           JSF
angular js
node js
react js

service layer:
main component code will be in the service layer.
business related, transaction, security, business validation
tech:
EJB
springs



Integration layer:
(optional)
for third party communication
acts as bridge between third party and java
third party communication:
customer ->paytm/goibibo/yatra/redbus/abhibus   ----> Fligt for airasia

technology:
web services
hadoop 
cloud
spring cloud 
spring rest


DB layer:
DB related code
acts as a bridge between db and java layer

tech:
oracle
sql server
hana
mysql




DAO Layer:
tech:
hibernet
jpa
spring jdbc
jdbc
toplink
ibatics
eclipse link








UI ---------> Frontend
Presentation till DB ----> Backend
Presentation til DAO --> Java development
This layered is also represents the flow of request from the client.


Hibernate  supports only for dao layer

Springs framework:
framework (prewritten code that contains solution for all common prblms in the project)
----------------------
-Open source
- lightweight framework
- supports all the layers
- framework of frameworks because it provides support to various frameworks
- has different modules ex: IOC, AOP, DAO, Context, ORM, WEB MVC , Securit , Boot ,
clud, batch , trasaction , msg service , 
-Loose Coupling
- Fast Development for enterprise apps.
- requires just simple configuration and there is no need to use app server . 
POJO Based development
inbuilt design patterns 
Provides predefined templates for JDBC, Hibernate, JPA, web  etc.,
 thus reducing your effort of writing too much code.

problms:
-> Cosumer has to resolve dependencies
-> In case if any dependency is added , the consumer has to take risk to 
resolve the dependencies..
-> Multi consumers who calls the method has to resolve the dependencies..
-> Developer is not sure  how to resolve dependencis  and not sure of how 
many dependencies.......













----------------------------------------------------------
----------------------------------------------------------
A project is develope dusing a layered architecture
every layer is independent .

  
	UI 	    ------>          	 Presentation      		------>		       Service layer   	------>	       Integration Layer     	------>	     	DAO Layer    ------> 			     DB layer
          <------															  	<------                           <------         (optional)            <------                     <------
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Front end develpment         -Request capturing						 				-	business related							- for 3rd party communication				-	DB related code							      data storage and maintain
web pages development        -req validation											-txn , security ,business				-	acts as bridge between						- acts a  bridge between					 maintain tables, stores pro,funtions
events handling              -req deligation	                      valdation                      3rs party and java app              	db and java layer																																																											 		
                             -response preparation                                       
                             -acts as bridge between web pages
                             and java app
                         
tech:													tech:												 					tech:														tech:															tech:															tech: 
html                          servlets + jsp OR											EJB															hadoop         										jdbc  														oracle	
java scipt                    struts  OR														Springs													cloud 														hibernate													sql server
jquery                        springs mvc OR																												web services	  									spring jdbc 											hana
css                           JSF																																		spring cloud											jpa																my sql
angular js                                                                                          spring rest                            eclipse link
node js                                                                                                                               top link
react js                                                                                                                              ibatics


UI ---------> Frontend
Presentation till DB ----> Backend
Presentation til DAO --> Java development
This layered is also represents the flow of request from the client.


Hibernate  supports only for dao layer

Springs framework:
framework (prewritten code that contains solution for all common prblms in the project)
----------------------
-Open source


----------------------------------------------------------------------
April 18
There are two types of classes:
  ----------------
  1. Pojo = i.v + setters + getters 
  2.Business/Bean/Service =  i.v + setters + getters  + business logic
  
  3.Pojo obj has realtime data/ customer i/p data or cust outcome data
    Bean objs doesnot contain relatime data
    
  4.Pojo obj has to be created for every request
   Bean Objs should be created only one time (i.e. first request)
   
  5. Pojo obj  will be deleted once response is given to customer,
  but bean objs will be available.....
  6.Resolving dependencies is mandatory for bean objs
	bean obj to be created by springs
    pojo obj to be created by developer
    
      Problems:
    1. To resolve chain of  dependencies for a bean object.
    2. Maintain single obj for the bean classes through out the application.
    
     solution:
-------------------------
  	1.Springs will create the object for all the Bean classes...
	ex: ProuctController, ProductService, ProductHelper, ProductDAO
	
	2.Springs also resolves the dependencies for every bean obj..
	3. Spring container will manage the single bean objs for every Bean class..
	Spring container contains pool of bean objs...
	4. Developer has to get the bean obj from springs and calls the respective methods....
    
    How to specify to springs what are the Bean classes?
	a) Springs.xml
	b) Annotations
	
	Springs.xml
	-----------
	->We need write a <bean> tag for very Bean class..
  	ProuctController, ProductService, ProductHelper, ProductDAO
  	ex1 is the package name
  	<beans>
	<bean id="control" class="ex1.ProductController" />
 	<bean id="service" class="ex1.ProductService" />
  	<bean id="dao" class="ex1.ProductDao" />
  	<bean id="helper" class="ex1.ProductHelper" />
  	</bean>
	every bean tag has bean id + class name
	
	
	 Syntax for getting bean obj:
---------------------------------
  	1.Create applicationcontext obj using springs.xml
  	2.This obj should be created only once.....
	3.using this obj develper can get any bean obj 
	
	
	1. Create app context obj
ApplicationContext context = new ClassPathXmlApplicationContext("file:src/ex1/springs.xml");

2.get bean obj using bean id
ProductController controlObj = (ProductController) context.getBean("control");
ProductService serviceObj = (ProductService) context.getBean("service");
ProductHelper helperObj = (ProductHelper) context.getBean("helper");
ProductDAO daoObj = (ProductDAO) context.getBean("dao");

*********************************************************************************
Bean class has dependencies:
-----------------------------------
  
  -> setter injection
  -> constr injection
                                           Java class                                                   Springs.xml
  --------------------|-----------------------------------------------------------------------------------------------------------------
  setter injection    |     Need setter methods for all dependencies                     Write property tag under the bean tag.
                      |  public void setDbName(String dbName) {                           <bean id="aService"  class="setterInject1.AccountService">
    					this.dbName = dbName;																						<property name="dbName" value="oracle" />
    				|		} 																															 </bean>
----------------------|---------------------------------------------------------------------------------------------------------------------  
  constr injection    |    Need constr that has all dependencies as arguments           Write constructor-arg tag under the bean tag.
  					|				public UserService(String userName, String pass) {         <bean id="uService"  class="constrInject1.UserService">
					|					this.userName = userName;                                         <constructor-arg value="system"/>
					|					this.pass = pass;                                                 <constructor-arg value="user@1234"/>
											|				}                                                          </bean>
  --------------------|----------------------------------------------------------------------------------------------------------------------
  
                        
public class AccountService {
private String dbName;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
}



public class UserService {
	//db info
	String userName;
	String pass;

	public UserService(String userName, String pass) {
		this.userName = userName;
		this.pass = pass;
	}
}
-----------------------------------------------
public class Person{
  
  private int id;
  public Person(){
    
  }
  public Person(int id){
     this.id= id
  }
  public void setId(int id){
    this.id= id
  }
  
}


approach1:(set the data using setter method)
--------------------------------------------------------
 Person p1 = new Person();
p.setId(200);


approach2:(set the data using during obj creation)
--------------------------------------------------------
Person p1 = new Person(200);
 */
}
