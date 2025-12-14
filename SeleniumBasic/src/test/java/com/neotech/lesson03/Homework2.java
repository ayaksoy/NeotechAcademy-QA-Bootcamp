package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.get("http://demo.guru99.com/test/newtours/");
    driver.findElement(By.cssSelector("a[href='register.php']")).click();
    driver.findElement(By.cssSelector("input[name = 'firstName']")).sendKeys("Ahmet");
    driver.findElement(By.cssSelector("input[name = 'lastName']")).sendKeys("aksoy");
    driver.findElement(By.cssSelector("input[name = 'phone']")).sendKeys("555555");
    driver.findElement(By.cssSelector("input[name = 'userName']")).sendKeys("Ahmet@gmail.com");
    driver.findElement(By.cssSelector("input[name = 'address1']")).sendKeys("hadimkoy");
    driver.findElement(By.cssSelector("input[name = 'city']")).sendKeys("istanbul");
    driver.findElement(By.cssSelector("input[name = 'state']")).sendKeys("marmara");
    driver.findElement(By.cssSelector("input[name = 'postalCode']")).sendKeys("34555");
    new Select (driver.findElement(By.cssSelector("select[name = 'country'"))).selectByVisibleText("TURKEY");
    driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("istanbul");
    driver.findElement(By.cssSelector("input[name = 'password']")).sendKeys("istanbul");
    driver.findElement(By.cssSelector("input[name = 'confirmPassword']")).sendKeys("istanbul");
    driver.findElement(By.cssSelector("input[name = 'submit']")).click();

    driver.quit();

    }

}
