package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTabVisualFeedbackHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String  userName= "yoll-student";
        String userPassword= "Bootcamp5#";
        WebElement userNameBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userNameBox.sendKeys(userName);
        Thread.sleep(2000);
        WebElement userPasswordBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        userPasswordBox.sendKeys(userPassword);
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();
        Thread.sleep(2000);
        System.out.println( driver.getTitle());
        WebElement pimButton = driver.findElement(By.xpath("//div[@class='menu']//b[text()='PIM']"));
        Thread.sleep(2000);
        String backgroundColor = pimButton.getCssValue("background");
        System.out.println(backgroundColor);
        pimButton.click();
        Thread.sleep(2000);
        WebElement personalInfo = driver.findElement(By.xpath("//*[@id='menu_pim_Configuration']/../../..//b"));
        String pimBackgroundColor = personalInfo.getCssValue("background");
        System.out.println(pimBackgroundColor);
        driver.quit();
    }
}
