package ebay;

import initialization.ChromeSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SearchCustomize extends ChromeSetup {

    @Test
    public void SearchCustomize() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.id("gh-shop-a")).click();
        driver.findElement(By.linkText("TV, audio & surveillance")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w2\"]/ul/li[3]/a")).click();
        driver.findElement(By.className("b-guidancecard__title")).click();
        driver.findElement(By.linkText("QLED")).click();
        driver.findElement(By.linkText("Wi-Fi Enabled")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-multiselect[0]\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-singleselect[8]\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-singleselect[12]\"]/a/span[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-multiselect[1]\"]/a/span[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-multiselect[3]\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-w0-multiselect[6]\"]/a/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-singleselect[0]\"]/a/span[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-w0-multiselect[5]\"]/a/span[1]")).click();


        driver.findElement(By.xpath("//*[@id=\"w1-w1-w0-w0-multiselect[0]\"]/a/span[1]")).click();

        driver.findElement(By.cssSelector("#w6-items\\[1\\] > div > div.s-item__info.clearfix > a > h3")).click();

        driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"qtyTextBox\"]")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ADDON_0\"]/div/div[2]/div/div[4]/div/button[1]")).click();

        }

    }

