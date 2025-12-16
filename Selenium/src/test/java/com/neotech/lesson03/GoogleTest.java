package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleTest {

    WebDriver driver;

    // 1. SAHNE HAZIRLIĞI (Her testten önce çalışır)
    @BeforeMethod
    public void sahneyiHazirla() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        System.out.println(">>> Tarayıcı açıldı ve Google'a gidildi.");
    }

    // 2. TEST SENARYOSU 1: Başlık Kontrolü
    @Test(priority = 1)
    public void baslikTesti() {
        String beklenenBaslik = "Google";
        String gercekBaslik = driver.getTitle();

        // Hard Assert: Başlık yanlışsa testi burada patlatır
        Assert.assertEquals(gercekBaslik, beklenenBaslik, "Başlık Google değil!");
        System.out.println("TEST 1 BAŞARILI: Başlık doğru.");
    }

    // 3. TEST SENARYOSU 2: Arama Yapma
    @Test(priority = 2)
    public void aramaTesti() {
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("Selenium" + Keys.ENTER);

        // --- DÜZELTME BAŞLANGICI ---

        // "Başlıkta 'Selenium' kelimesi geçene kadar en fazla 10 saniye bekle" diyoruz.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Selenium"));

        // --- DÜZELTME BİTİŞİ ---

        String sayfaBasligi = driver.getTitle();
        System.out.println("Gelen Başlık: " + sayfaBasligi); // Konsolda ne geldiğini gör

        Assert.assertTrue(sayfaBasligi.contains("Selenium"), "Arama sonuçlarına gidilemedi!");
        System.out.println("TEST 2 BAŞARILI: Arama yapıldı.");
    }

    // 4. TEMİZLİK (Her testten sonra çalışır)
    @AfterMethod
    public void kapat() {
        driver.quit();
        System.out.println("<<< Tarayıcı kapatıldı.\n");
    }
}