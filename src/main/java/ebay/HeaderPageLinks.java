package ebay;

import initialization.ChromeSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HeaderPageLinks extends ChromeSetup {

    @Test
    public void savedLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void motorsLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void fashionLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void electronicsLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void collectiblesLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void homeGardenLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sportingGoodsLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void toysLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void businessIndustrialLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void musicLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void dealsLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void myEbayLink() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

