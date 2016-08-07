package learn.spring;

import java.util.Date;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

@SpringBootApplication
@EnableJms
//@ImportResource("classpath:jms-config.xml")
public class SpringV4ServerSideConceptsApplication /*implements CommandLineRunner*/{

	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringV4ServerSideConceptsApplication.class, args);
		
		 MessageCreator messageCreator = new MessageCreator() {
	            @Override
	            public Message createMessage(Session session) throws JMSException {
	                return session.createTextMessage(String.format("ping! - %s", new Date()));
	            }
	        };
	        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
	        System.out.println("Sending a new message.");
	        jmsTemplate.send("spring-boot-jms", messageCreator);
	        jmsTemplate.send("spring-boot-jms", messageCreator);
	        
	}


}
