package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ornek_AmazonKayıtSayfasıT extends TestBase {
    // Day 14
    @Test
    public void test01(){
        driver.get("http://www.amazon.com");
        WebElement sing_in = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(sing_in).perform();
        driver.findElement(By.partialLinkText("Start here.")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("a");
        driver.findElement(By.id("ap_email")).sendKeys("b.@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("aTRWds");
        driver.findElement(By.id("ap_password_check")).sendKeys("aTRWds");
        //driver.findElement(By.id("continue")).click();
        System.out.println(driver.getTitle());
        boolean TorF = driver.getTitle().equals("Amazon Registration");
        Assert.assertTrue(TorF); //  driver.getTitle().equals("Amazon Registration")
                                 //  ütsteki kısmı ister Assert kavramının içine yazarsinız
                                 //  isterseniz bir boolean ismini atarsınız o şekilde kulanızsınız.

        //Assert.assertFalse(!driver.getTitle().equals("Amazon Registration"));
        //Assert.assertFalse(!TorF); //bu şekildede yazıla bilir.

        //Assert.assertEquals(driver.getTitle(),"Amazon Registration"); // burda ilki sonuç ikicisi beklenen sonuç olarak kulanmalıyız.
        System.out.println("çalıştı");

    }
    @Test (dependsOnMethods = "test01")
    public void test02(){
        System.out.println("ikisini birbirine bağlamammız alazım bunun sebebi test1 methodun");
        System.out.println("yarısınıburaya alsakdık bu iki methodu sırasınagöre bağlamammız lazımdı.");
    }
}
