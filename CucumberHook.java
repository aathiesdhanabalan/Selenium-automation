package com.quinbay.cucumber;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHook {


        @io.cucumber.java.Before
        public void testBefore(){
            System.setProperty("webdriver.chrome.driver","/Users/athies/Downloads/PageObjectModel/src/main/resources/driver");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://en-gb.facebook.com/login/");
            System.out.println("This is a demo of before hook");
        }

        @io.cucumber.java.After
        public void testAfter(){
            System.out.println("This is a demo of after hook");
        }

}


