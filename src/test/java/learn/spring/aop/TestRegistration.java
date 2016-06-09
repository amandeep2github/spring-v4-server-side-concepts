package learn.spring.aop;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import learn.spring.SpringV4ServerSideConceptsApplication;
import learn.spring.aop.RegistrationProcessor;
import learn.spring.domain.Donor;
import learn.spring.domain.Organisation;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringV4ServerSideConceptsApplication.class)

public class TestRegistration {
	
	@Autowired
	RegistrationProcessor regProcessor;
	@Test
	//@Ignore
	public void testOrganisationRegistration() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(100);
		System.setOut(new PrintStream(baos));
		Organisation org = new Organisation();
		org.setName("Parivartan Sandesh Foundation");
		regProcessor.register(org);
		assertEquals("test fails", String.format("%s%n%s%n", "class learn.spring.aop.RegistrationProcessor","Parivartan Sandesh Foundation"), baos.toString());
		//fail("Not yet implemented");
	}
	
	@Test(expected=RuntimeException.class)
	@Ignore
	public void testDonorRegistration() {
		Donor donor = new Donor();
		regProcessor.register(donor);
		
		//fail("Not yet implemented");
	}

}
