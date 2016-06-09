package learn.spring.aop;

import org.springframework.stereotype.Component;

import learn.spring.domain.Donor;
import learn.spring.domain.Organisation;

@Component
public class RegistrationProcessor {
	
	public boolean register(Organisation org){
		boolean registered = false;
		return registered;
	}
	
	public boolean register(Donor donor){
		throw new RuntimeException("Not yet implemented");
	}
	
	

}
