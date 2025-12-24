package com.neotech.lesson06;

import com.neotech.utils.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertDemo extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://neotech.vercel.app/delete-customer");

        driver.findElement(By.id("customerId")).sendKeys("123");
        Thread.sleep(2000);

        driver.findElement(By.id("btnDeleteCustomer")).click();

        Alert simpleAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(simpleAlert.getText());
        simpleAlert.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.id("btnDeleteCustomer")).click();

        Thread.sleep(2000);
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
        Thread.sleep(2000);
        System.out.println(simpleAlert.getText());

        simpleAlert.accept();
        Thread.sleep(2000);

        Thread.sleep(2000);





        tearDown();
    }
}
