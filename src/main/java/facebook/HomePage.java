package facebook;

import initialization.ChromeSetup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePage extends ChromeSetup {

    //Homework :    30 Test Cases From Ebay (Not 1 or 2 clicks, implement all that we have learned so far in different test cases)
    //Run some test cases in the mozilla,some in the chrome
    //Take screenshot

    //public static void main(String[] args) {
        //setupDriver("mac", "https://www.ebay.com", "chrome");

    @Test
    public void facebookLogin() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
        //driver.findElement(By.xpath("//*[@value='Log In']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void messengerRediraction() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.linkText("Messenger")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void login() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"js_0\"]/ul/li[2]/a")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void help() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void local() {
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //ToDo : write 5 test case from Facebook



}