package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.neotechacademy.com/");
        Thread.sleep(500);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.neotechacademy.com/";

        assert actualUrl != null;
        if(actualUrl.equals(expectedUrl))
            System.out.println("Page title: "+driver.getTitle());
        else
            System.out.println("Wrong URL");

        driver.quit();
    }
}
