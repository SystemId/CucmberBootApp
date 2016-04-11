package net.xeric.demos.pages;

import net.xeric.demos.DemoApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/2/16.
 *
 * Simple test of Page Object. If this doesn't work, then Selenium tests that use
 * Page Objects probably aren't going to work either.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
// This is for when the app isn't already running
@WebAppConfiguration

//This will startup tomcat before running the test
//@WebIntegrationTest
public class DemoPageIT {
    @Autowired
    DemoPage demoPage;
    
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void simpleTest() {
        demoPage.go();
        demoPage.addNumbers(5,5);
        assertEquals(10, demoPage.getAdderResults());
    }
    
    @Test
    public void TestRomanNumerals() throws JsonProcessingException {        
        demoPage.calculateNumerals(5);
        assertEquals("V", demoPage.getNumerals());
    }
}
