package learn.spring.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	/**
     * Get a copy of the application context
     */
    @Autowired
    ConfigurableApplicationContext context;

    /**
     * When you receive a message, print it out, then shut down the application.
     * Finally, clean up any ActiveMQ server stuff.
     */
    @JmsListener(destination = "spring-boot-jms")// subscription="durable-sub"
    public void receiveMessage(String message) {
        System.out.println("Received Not Durable 1 <" + message + ">");
        //context.close();
        //FileSystemUtils.deleteRecursively(new File("activemq-data"));
    }
    
    

}
