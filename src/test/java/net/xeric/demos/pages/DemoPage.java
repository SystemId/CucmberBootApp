package net.xeric.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by markshead on 4/2/16.
 */

@Component
public class DemoPage {
    @Autowired
    WebDriver driver;

    @Autowired
    public DemoPage(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void go() {
        driver.get("http://localhost:8080/");
    }

    public void addNumbers(int x, int y) {
        driver.findElement(By.id("adder-first-number")).sendKeys(Integer.toString(x));
        driver.findElement(By.id("adder-second-number")).sendKeys(Integer.toString(y));
        driver.findElement(By.id("adder-button")).click();
    }

    public int getAdderResults() {
        return Integer.parseInt(driver.findElement(By.id("adder-result")).getText());
    }
    
    public void calculateNumerals(int x) {
    	driver.findElement(By.id("numeral-input")).sendKeys(Integer.toString(x));
    	driver.findElement(By.id("numeral-button")).click();
    }
    
    public String getNumerals(){
    	return driver.findElement(By.id("numeral-result")).getText();
    }

    public int getCount() {
        return Integer.parseInt(driver.findElement(By.id("counter")).getText());
    }

    public void clickIncrement() {
        driver.findElement(By.id("increment-button")).click();
    }
}
