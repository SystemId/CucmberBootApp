package net.xeric.demos.controllers;

import static org.junit.Assert.assertEquals;
import net.xeric.demos.DemoApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.databind.ObjectMapper;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebAppConfiguration
public class NumeralControllerIT {
	
	@Autowired
	NumeralController numeralController;
	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void testAdder() throws Exception {
		assertEquals(mapper.writeValueAsString("I"),numeralController.numeral(1));
		assertEquals(mapper.writeValueAsString("Invalid"),numeralController.numeral(-1));
		assertEquals(mapper.writeValueAsString("Invalid"),numeralController.numeral(0));
		
	}

	

}
