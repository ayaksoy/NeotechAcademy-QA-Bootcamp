package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.Selector;

public class homeWork2 {
//    HW2: Facebook sign up:
//    Open chrome browser
//    Go to "https://www.facebook.com/"
//    Click on Sign Up link
//    Enter first name
//    Enter last name
//    Enter email address
//    Re-enter email address
//    Click on Sign Up button

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("ahmet");
        driver.findElement(By.name("lastname")).sendKeys("ahmet");
        Select daySelect = new Select(driver.findElement(By.name("birthday_day")));
        daySelect.selectByVisibleText("11");
        Select monthSelect = new Select(driver.findElement(By.name("birthday_month")));
        monthSelect.selectByIndex(7);
        Select yearSelect = new Select(driver.findElement(By.id("year")));
        yearSelect.selectByVisibleText("2001");
        driver.findElement(By.cssSelector("input[value='1']")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("ahmet@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password01");
        driver.findElement(By.name("websubmit")).click();
        driver.quit();
    }
}
