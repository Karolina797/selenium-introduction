package com.selenium.karolinadutka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rediff.com");

        //Regular expression Css
        driver.findElement(By.cssSelector("a[title*='Sign in'")).click();

        //Xpath -->   //tagName[@attribute='value']"
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");

        // Css selector using tagName#id(the value od id)
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");

        //Regular expression Xpath
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    }
}
