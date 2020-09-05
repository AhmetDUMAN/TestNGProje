package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassTest extends TestBase {
    @Test
    public void sagTıklama(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //<div id="hot-spot" style="border-style: dashed; border-width: 5px; width: 250px; height: 150px;" oncontextmenu="displayMessage()">
        //  </div>
        WebElement element =driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        //bir webelement'e sağ tıklamak için bu kodu kullanırız
        //actions class ile işlem yaparsanız, herseferinde "perfom()" kullanmak zorundayız.
        actions.contextClick(element).perform();
    }
    @Test
    public void çiftTıklama(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        //<button ondblclick="myFunction()">Double-Click Me To See Alert</button>
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action = new Actions(driver);
        action.doubleClick(button).perform();
    }
    @Test
    public void asagiYukari(){
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
        actions.sendKeys(Keys.PAGE_UP).perform();
    }
}
