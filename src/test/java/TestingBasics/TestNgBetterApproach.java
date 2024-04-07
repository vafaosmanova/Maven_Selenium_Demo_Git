package TestingBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgBetterApproach {
    //verify_Logo_Is_Displayed for Cucumber (SnakeCase instead a CamelCase)
    @Test
    public void verifyLogoIsDisplayed()throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        Thread.sleep(5000);

       WebElement allCookiesAccept = driver.findElement(By.xpath("//*[@class='EM1Mrb']"));
        allCookiesAccept.click();
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.cssSelector("img[alt=Google]"));
        boolean isLogoDisplayed = logo.isDisplayed();

        if(isLogoDisplayed){
            System.out.println("LOGO Verification: PASSED");
        } else {
            System.out.println("LOGO Verification: FAILED");
        }


        // Verify the PageTitle is - Google

        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Google"; // The expected value is usually in your - ticket/user story/requirements

        if(actualPageTitle.equals(expectedPageTitle)){
            System.out.println("TITLE verification: PASSED");
        } else {
            System.out.println("TITLE verification: FAILED");
        }
        Assert.assertTrue(isLogoDisplayed);
        driver.quit();

    }
    @Test
    public void verifyPageTitle(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "Google"; // The expected value is usually in your - ticket/user story/requirements
        WebElement allCookiesAccept = driver.findElement(By.xpath("//*[@class='EM1Mrb']"));
        allCookiesAccept.click();
//        if(actualPageTitle.equals(expectedPageTitle)){
//            System.out.println("TITLE verification: PASSED");
//        } else {
//            System.out.println("TITLE verification: FAILED");
//        }

        Assert.assertEquals(actualPageTitle, expectedPageTitle);

        driver.quit();
    }



}

