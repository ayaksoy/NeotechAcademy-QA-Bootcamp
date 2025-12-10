package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.amazon.com/");
        String currentTitle = chrome.getTitle();
        String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        if(currentTitle.equals(expectedTitle))
            System.out.println("Page title: "+chrome.getTitle());
        else
            System.out.println("Page title doesnt match the expected title!");
        chrome.quit();

    }
}
