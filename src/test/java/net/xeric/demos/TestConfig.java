package net.xeric.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by markshead on 4/2/16.
 */
@Configuration
public class TestConfig {

    @Bean(destroyMethod = "quit")
    public WebDriver getWebDriver() {
        final WebDriver webDriver = new FirefoxDriver();
        return webDriver;
    }
}
