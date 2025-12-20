package com.neotech.lesson06;

import com.neotech.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownDemo extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setUp();
        driver.findElement(By.id("tbxUsername")).sendKeys("admin");
        driver.findElement(By.id("tbxPassword")).sendKeys("admin");
        Thread.sleep(2000);
        Select yearDD = new Select(driver.findElement(By.id("ddlAcademicYear")));

        yearDD.selectByValue("2010");
        Thread.sleep(2000);
        yearDD.selectByIndex(3);
        Thread.sleep(2000);
        yearDD.selectByVisibleText("2022-23");


        List<WebElement> options = yearDD.getOptions();









        Thread.sleep(2000);
//        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);


        tearDown();




    }
}
