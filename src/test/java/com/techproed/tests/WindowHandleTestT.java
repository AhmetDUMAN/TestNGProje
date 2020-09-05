package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTestT extends TestBase {
    @Test
    public void çokluPencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        String sayfanınHandle = driver.getWindowHandle();
        System.out.println(sayfanınHandle);

        // WebElement link =  bu kısmı kulanmamıza gerek yok çünkü ensonuna .click() yazarsak zaten buldugu
        // webelement'e tıklamasını sağlamış oluruz.
        driver.findElement(By.partialLinkText("Click Here")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<String> tümPencereler = driver.getWindowHandles();
        /*
        elimizdeki tüm pencerelerin windows handle'larını bu şekilde alabiliriz.
        for(String handle : tümPencereler){
            System.out.println(handle);
        }*/
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object[] array = (Object[]) tümPencereler.toArray();
        //(tümPencereler.toArray())[tümPencereler.size()-1] bu ile array[array.length-1] bu aynı anlama geliyor
        String ikinciSayfaHandle = (String) array[array.length-1].toString();
        System.out.println(ikinciSayfaHandle);
        driver.switchTo().window(sayfanınHandle);
        /*
        bu şekilde  istediğimiz sayfaya geçebiliriz
        for (int i = 0; i< tümPencereler.size();i++){
            if (i==tümPencereler.size()-1){
                driver.switchTo().window(tümPencereler.iterator().next());
            }
        }*/


    }
}
