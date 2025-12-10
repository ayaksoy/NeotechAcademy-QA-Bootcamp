package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriver fireFox = new FirefoxDriver();
        fireFox.get("https://www.redfin.com/");
        if(fireFox.getCurrentUrl().equals("https://www.redfin.com/"))
            System.out.println("Test passed!");
        else
            System.out.println("Test failed!");
        fireFox.quit();
    }
}
