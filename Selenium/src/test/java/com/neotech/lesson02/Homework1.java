package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();

        chrome.get("https://demo.guru99.com/test/newtours/");
        chrome.findElement(By.linkText("REGISTER")).click();
        chrome.findElement(By.name("firstName")).sendKeys("Ahmet");
        chrome.findElement(By.name("lastName")).sendKeys("Aksoy");
        chrome.findElement(By.name("phone")).sendKeys("5555555");
        chrome.findElement(By.name("userName")).sendKeys("Ahmet@gamil.com");
        chrome.findElement(By.name("address1")).sendKeys("istanbul/arn");
        chrome.findElement(By.name("city")).sendKeys("istanbul");
        chrome.findElement(By.name("state")).sendKeys("Turkey");
        chrome.findElement(By.name("postalCode")).sendKeys("Ahmet");
        chrome.findElement(By.name("country")).sendKeys("Ahmet");
        chrome.findElement(By.name("email")).sendKeys("Ahmet");
        chrome.findElement(By.name("password")).sendKeys("Ahmet");
        chrome.findElement(By.name("confirmPassword")).sendKeys("Ahmet");
        chrome.findElement(By.name("submit")).click();

    }
}
