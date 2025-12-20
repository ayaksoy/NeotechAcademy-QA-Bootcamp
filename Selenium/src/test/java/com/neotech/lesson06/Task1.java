package com.neotech.lesson06;

import com.neotech.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends BaseClass {
    public static void main(String[] args) {

        //     Go to https://www.facebook.com/r.php
//     Verify:
//     month dd has 12 month options
//     day dd has 31 day options
//     year dd has 121 year options
//     Select your date of birth
//     Quit browser

        setUp();

        int days = new Select(driver.findElement(By.id("day"))).getOptions().size();
        int months = new Select(driver.findElement(By.id("month"))).getOptions().size();
        int years = new Select(driver.findElement(By.id("year"))).getOptions().size();

        if(days == 31)
            System.out.println("Days test passed");
        else
            System.out.println("Days test failed");

        if(months == 12)
            System.out.println("month test passed");
        else
            System.out.println("month test failed");

        if(years == 121)
            System.out.println("year test passed");
        else
            System.out.println("year  test failed");

        tearDown();


    }
}
