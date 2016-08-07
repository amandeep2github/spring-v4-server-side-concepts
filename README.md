Problem:
Caused by: org.apache.activemq.artemis.api.core.ActiveMQNotConnectedException: AMQ119007: Cannot connect to server(s). Tried with all available servers.

java.lang.ClassNotFoundException: org.apache.activemq.artemis.core.remoting.impl.invm.InVMConnectorFactory

Fix: don't use the dependency added by sts for artemis or hornetq
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-artemis</artifactId>
		</dependency>
		
-- configuration can also be given as		
@ConfigurationProperties(prefix = "spring.activemq")
public class ActiveMQProperties {

Problem:
setClientID call not supported on proxy for shared Connection. Set the 'clientId' property on the SingleConnectionFactory instead.

alternative to: spring.jms.pub-sub-domain=true
@Bean
public DefaultMessageListenerContainer jmsListenerContainerFactory() {
    DefeaultMessageListenerContainer dmlc = new DefaultMessageListenerContainer();
    dmlc.setPubSubDomain(true);
    // Other configuration here
    return dmlc;
}


Links:
http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-messaging.html
http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jms.html


Running the broker
From the binary distribution you can run the Apache ActiveMQ server via the bin/activemq command. If you're using Windows, just type
    cd bin
    activemq.bat
On Unix-like systems, type

    ./bin/activemq console
to start the broker in foreground.

The broker can be started as a background process via the bin/activemq command on Unix-like systems, type
    ./bin/activemq start
to start the broker in background. The broker will write to its log in the data/activemq.log file.
Stopping the broker
The broker can be stopped via the bin/activemq command If you're using Windows, just type
    cd bin
    activemq.bat stop
On Unix-like systems, type
    ./bin/activemq stop
to stop the broker.
Access the web console
In a web browser you can access the url http://0.0.0.0:8161/admin 

		
		