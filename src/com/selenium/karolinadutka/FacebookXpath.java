package com.selenium.karolinadutka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");


        // For xpath:   //tagName[@attribute = 'value']   --> you can replace tagName with * if you don't know the tagName
//        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//        driver.findElement(By.xpath("//input[@value = 'Zaloguj się']")).click();


        // For css selector:   tagName[attribute = 'value'] --> you can skip tagName
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
        driver.findElement(By.cssSelector("[value = 'Zaloguj się']")).click();


    }

}
