# hellospring

●hellospring1
    
    |-- Web  Application Context 
      (spring-servlet.xml <- ClassPathWebXmlApplicationContext)

●hellospring2

    |-- Web  Application Context 
      (WebConfig.java <- AnnotationConfigWebApplicationContext)

●hellospring3

    |-- Web  Application Context
      (WebConfig.java, AbstarctAnnotationConfigDispatcherServletInitializer를 이용하여 web.xml 제거)
