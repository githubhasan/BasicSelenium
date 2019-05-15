package ebay;

import initialization.ChromeSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends ChromeSetup {

    @Test
    public void ebayLoginFailVerification() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equalsIgnoreCase("Get help signing in")) {
            System.out.println("ebayLoginFailVerification : Passed");
        } else System.out.println("ebayLoginFailVerification : Failed");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ebayLoginPassVerification() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("mdshowkathasan83@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("eE9175004510");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay")) {
            System.out.println("ebayLoginPassVerification : Passed");
        } else System.out.println("ebayLoginPassVerification : Failed");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void ebayPasswordResetVerification() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
        driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"userInfo\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"userInfo\"]")).sendKeys("mdshowkathasan83@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"primsecbtns\"]/button")).click();

//        driver.findElement(By.partialLinkText("Get help signing in"));
//        driver.findElement(By.xpath("//*[@id=\"defaulttext\"]/div[2]/p[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"pinTxtBx\"]")).sendKeys("6629");
//        driver.findElement(By.xpath("//*[@id=\"verifyCodeForm\"]/div[2]/button")).click();

        String title = driver.getTitle();
        System.out.println(title);

        if (title.equalsIgnoreCase("Get help signing in")) {
            System.out.println("ebayPasswordResetVerification : Passed");
        } else System.out.println("ebayPasswordResetVerification : Failed");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}






