package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class SeleniumMethods extends ChromeSetup {

    public static void main(String[] args) {
        setupDriver("mac", "https://www.ebay.com", "chrome");

        //get title
        String title = driver.getTitle();
        System.out.println(title);
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.ebay.com/";

        //Hard Assert
        //Assert.assertEquals(actualURL,expectedURL);

        //Soft Assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualURL, expectedURL);

        if (actualURL.equalsIgnoreCase(expectedURL)) {
            System.out.println("Passed");
        } else System.out.println("Failed");


        WebElement saved = driver.findElement(By.linkText("Saved"));
        System.out.println(saved.getText());

        //saved.getAttribute("color");
        //saved.getCssValue("color");
        if (saved.isDisplayed()) {
            System.out.println(saved.getText() + " : is displayed");
        }

        WebElement searchBar = driver.findElement(By.xpath("//*[@id='gh-ac']"));
        searchBar.clear();
        searchBar.click();
        searchBar.sendKeys("Java Books");


        WebElement search = driver.findElement(By.xpath("//*[@id='gh-btn']"));
        search.click();


        //GET PAGESOURCE
        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);


        //back
        driver.navigate().back();
        //forward
        driver.navigate().forward();
        //refresh the page
        //driver.navigate().refresh();

        //navigate to different url
        driver.navigate().to("https://www.yahoo.com");


        try {
            Thread.sleep(5000);
        } catch (Exception ee) {

        }

        driver.manage().deleteAllCookies();

        driver.close();
        driver.quit();

    }
}








//package initialization;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;
//
//public class SeleniumMethods extends ChromeSetup{
//    public static void main(String[] args) {
//        setupDriver("Mac", "https://www.ebay.com/", "chrome");
//        String title =driver.getTitle();
//        System.out.println(title);
//
//        String actualTitle=driver.getTitle();
//        System.out.println(actualTitle);
//        String expectedTitle="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";
//
////      verifiening title or url
//        if(actualTitle.equalsIgnoreCase(expectedTitle)){
//            System.out.println("Passed");
//        }else System.out.println("Failed");
//
////        String actualURL=driver.getCurrentUrl();
////        String expectedURL="https://www.ebay.com/";
////         if(actualURL.equalsIgnoreCase(expectedURL)) {
////             System.out.println("passed");
////        }else System.out.println("failed");
//
//
////        or
////        hard assert
////        Assert.assertEquals(actualTitle,expectedTitle);
//
////        or
////        soft assert
////        SoftAssert softAssert =new SoftAssert();
////        softAssert.assertEquals(actualTitle,expectedTitle);
//
//
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("java books");
//        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//
////        String currentURL=driver.getCurrentUrl();
////        System.out.println(currentURL);
//
//        //getpagesource
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//
//        //back
//        driver.navigate().back();
//        //forward
//        driver.navigate().forward();
//        //refresh
//        driver.navigate().refresh();
//
//        //go to different website
//        driver.navigate().to("https://www.yahoo.com");
//
//        try {
//            Thread.sleep(5000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //driver.manage().deleteAllCookies();
//
//        driver.close();
//        driver.quit();
//    }
//}
