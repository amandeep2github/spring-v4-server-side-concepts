package learn.spring.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver2 {
	@JmsListener(destination = "spring-boot-jms")// subscription="durable-sub"
    public void receiveMessage(String message) {
        System.out.println("Received Not Durable 2 <" + message + ">");
        //context.close();
    }
}
