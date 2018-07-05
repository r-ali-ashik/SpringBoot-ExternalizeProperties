#Externalize The Config Properties

**Description:** This demo project demonstrate how to use external properties files other than application.properties in spring boot application

**Workflow:**
    
    * we have created config.properties files in resource folder
    * config.properties files following properties
        * mongodb.url=1.2.3.4
        * mongodb.db=hello 
    * TestController is annotated with @PropertySource annotation which refers the config.properties file to TestController
    * @Value annotaion injects property into the instance variable
    
Author:

Ali Ashik

[aliashiks.blogspot.com](http://aliashiks.blogspot.com)
