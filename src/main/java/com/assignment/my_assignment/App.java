package com.assignment.my_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator cal = new Calculator();
        System.out.println(cal.sum(30, 40));
        System.out.println(cal.divide(3, 3));
        System.out.println(cal.subtract(40, 40));
        //initialize the drive
        //System.setProperty("webdriver.chrome.driver","/Users/asambaraju/Desktop/Devops_Demo/chromedriver-mac-arm64/chromedriver");
        WebDriverManager.chromedriver().setup();
        
        //set chrome parameters
        ChromeOptions chromeOptions = new ChromeOptions();
        //add configuration
        chromeOptions.addArguments("--headless");
        
        //initialize web driver 
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        //open the URL in the browser
        driver.get("https://www.facebook.com/");
        System.out.println("hello test cases are executing");
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //enter the email and password then click login
        driver.findElement(By.id("email")).sendKeys("sambaraju_adithya@gmail.com");
                
        driver.findElement(By.id("pass")).sendKeys("magic");

        driver.findElement(By.name("login")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.close();
        System.out.println("hello test cases are executed ");
    }
}
