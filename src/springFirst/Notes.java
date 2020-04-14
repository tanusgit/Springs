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

 */
}
