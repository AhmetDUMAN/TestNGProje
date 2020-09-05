package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionClassTestT extends TestBase {
    @Test
    public void sağtıklama(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element= driver.findElement(By.id("hot-spot"));
        Actions action = new Actions(driver);

        //bir webelement'e sağ tıklama için kodu kullanırz.
        // actions class ile işlem yaparsanız, HER SEFERRİNDE "PERFORM" yapmak zorundasınız.
        action.contextClick(element).perform();

    }
    @Test
    public void çiftTıklama(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        //<button ondblclick="myFunction()">Double-Click Me To See Alert</button>
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action = new Actions(driver);
        // bir webelement'e iki kere tıklamak istiyorsak
        //doubleClick methodunu kullanmalıyız
        action.doubleClick(button).perform();
    }
    @Test
    public void hoverOver(){
        driver.get("http://amazon.com");
        WebElement menu = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        //mouse'u istediğimiz webelement'in üzerine götürmek istiyorsak,
        //moveToElement methodunu kullanabiliriz.
        actions.moveToElement(menu).perform();
    }
    @Test
    public void aşağıYukarı(){
        driver.get("http://amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.END).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.sendKeys(Keys.ARROW_UP).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actions.sendKeys(Keys.HOME).perform();

    }

}
