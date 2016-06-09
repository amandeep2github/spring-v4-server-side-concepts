package learn.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import learn.spring.SpringV4ServerSideConceptsApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringV4ServerSideConceptsApplication.class)
@WebAppConfiguration
public class SpringV4ServerSideConceptsApplicationTests {

	@Test
	public void contextLoads() {
	}

}
