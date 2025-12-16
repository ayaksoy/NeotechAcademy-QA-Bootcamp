package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver chrome = new FirefoxDriver();
        chrome.get("http://demo.guru99.com/test/newtours/");
        chrome.findElement(By.xpath("//a[text()='REGISTER']")).click();
        chrome.findElement(By.xpath("//input[contains(@name,'rstNam')]")).sendKeys("Ahmet");
        chrome.findElement(By.xpath("//input[starts-with(@name, 'lastN')]")).sendKeys("Aksoy");
        chrome.findElement(By.xpath("//input[@name='phone']")).sendKeys("55555555");
        chrome.findElement(By.xpath("//input[@name='userName']")).sendKeys("Ahmet@gmail.com");
        chrome.findElement(By.xpath("//input[@name='address1']")).sendKeys("Hadimkoy");
        chrome.findElement(By.xpath("//input[@name='city']")).sendKeys("Istanbul");
        chrome.findElement(By.xpath("//input[@name='state']")).sendKeys("Marmara");
        chrome.findElement(By.xpath("//input[starts-with(@name, 'postal')]")).sendKeys("34555");
        new Select(chrome.findElement(By.xpath("//select[@name='country']"))).selectByVisibleText("TURKEY");
        chrome.findElement(By.xpath("//input[@id='email']")).sendKeys("meth");
        chrome.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
        chrome.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123");
        chrome.findElement(By.xpath("//input[@name='submit']")).click();
        chrome.quit();
    }
}
