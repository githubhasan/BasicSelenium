package ebay;

import initialization.FirefoxSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppingCart extends FirefoxSetup {

    @Test
    public void shoppingCartVerification() {
        setupDriver("Mac", "https://www.ebay.com/", "gecko");

        //searching for item
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Java Books");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Add item to cart
        driver.findElement(By.xpath("//*[@id=\"srp-river-results-listing1\"]/div/div[1]/div/a/div/img")).click();
        driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sbin-signin-btn\"]")).click();

        //user login for checkout

        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("mdshowkathasan83@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();

    }
}

