package com.selenium.karolinadutka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleParentChildXpath {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        // xpath -->  Parent xpath/child tagName/child tagName/....

        driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Hello!");
    }
}
