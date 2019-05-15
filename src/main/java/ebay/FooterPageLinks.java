package ebay;

import initialization.ChromeSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FooterPageLinks extends ChromeSetup {

    @Test
    public void buyLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("Buy")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sellLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("Sell")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void toolsLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul/li[6]/h3")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ebayCompaniesLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[1]/h3")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void aboutEbayLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("About eBay")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void helpContactLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("Help & Contact")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void communityLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("Community")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void StayConnectedLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[5]/h3")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
