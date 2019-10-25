package com.selenium.karolinadutka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {


    public static void main(String[] args) {

        // invoke .exe file first
        //Create Driver object for Chrome Browser

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        //System.out.println(driver.getPageSource());


        driver.get("http://yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();

        //driver.close(); // It closes current browser
        //driver.quit(); // It closes all the browsers opened by selenium script


    }
}
