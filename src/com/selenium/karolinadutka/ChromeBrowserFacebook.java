package com.selenium.karolinadutka;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserFacebook {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");

/*   driver.findElement(By.id("email")).sendKeys("This is my first code");
     driver.findElement(By.name("pass")).sendKeys("123456");
  If there is a link we can use link text:
     driver.findElement(By.linkText("Nie pamiętasz nazwy konta?")).click();
*/

        driver.findElement(By.cssSelector("input#email.inputtext.login_form_input_box")).sendKeys("emailaddress");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();


    }


}
