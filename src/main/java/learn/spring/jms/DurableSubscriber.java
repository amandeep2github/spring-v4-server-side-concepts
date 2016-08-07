package learn.spring.jms;

import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

public class DurableSubscriber implements MessageListener {
	
	/**
     * Get a copy of the application context
     */
    //@Autowired
    ///ConfigurableApplicationContext context;

	@Override
	public void onMessage(Message message) {
		System.out.println("This is Durable Receiver <" + message + ">");
		//context.close();

	}

}
