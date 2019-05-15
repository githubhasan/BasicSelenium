package ebay;

import initialization.ChromeSetup;
import initialization.FirefoxSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePage extends FirefoxSetup {

    //Homework :    30 Test Cases From Ebay (Not 1 or 2 clicks, implement all that we have learned so far in different test cases)
    //Run some test cases in the mozilla,some in the chrome
    //Take screenshot

    @Test
    public void homePageUrlVerification() {
        setupDriver("mac", "https://www.ebay.com", "gecko");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.ebay.com/";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);

        if (actualURL.equalsIgnoreCase(expectedURL)) {
            System.out.println("Passed");
        } else System.out.println("Failed");

    }


    @Test
    public void homePageTitleVerification() {
        setupDriver("mac", "https://www.ebay.com", "gecko");
        String title = driver.getTitle();
        System.out.println(title);
    }


    @Test
    public void loginLinkVerification() {
        setupDriver("Mac", "https://www.ebay.com", "gecko");
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void registerLinkVerification() {
        setupDriver("Mac", "https://www.ebay.com", "gecko");
        driver.findElement(By.cssSelector("#gh-ug-flex > a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buyLinkVerification() {
        setupDriver("Mac", "https://www.ebay.com/", "gecko");
        driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")).click();
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equalsIgnoreCase("All Categories - Browse and Discover more | eBay")) {
            System.out.println("Passed");
        } else System.out.println("Failed");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


