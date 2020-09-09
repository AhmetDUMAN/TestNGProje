package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class Ornek_AmazonKayıtSayfası extends TestBase {
    @Test
    public void test01(){
        driver.get("https://amazon.com");
        WebElement button = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).perform();
        driver.findElement(By.partialLinkText("Start here.")).click();
        //Assert.assertTrue(driver.getTitle().equals("Amazon Registration"));
        Assert.assertEquals(driver.getTitle(),"Amazon Registration");
        System.out.println(driver.getTitle());
    }
    @Test
    public void amazon(){
        driver.get("https://amazon.com");
        WebElement button = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(button).perform();
        driver.findElement(By.partialLinkText("Start here.")).click();

        WebElement emailKutusu = driver.findElement(By.id("ap_customer_name"));
        emailKutusu.sendKeys("AhmetDuman");
        WebElement emailKutusu1 = driver.findElement(By.id("ap_email"));
        emailKutusu1.sendKeys("kanarya@gmail.com");
        WebElement pasword =driver.findElement(By.id("ap_password"));
        pasword.sendKeys("fafaf.");
        WebElement reenter = driver.findElement(By.id("ap_password_check"));
        reenter.sendKeys("fafaf.");
        driver.findElement(By.id("continue")).click();


    }
}
