package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://dev-hrm.yoll.io/index.php");
        Thread.sleep(5000);
        WebElement usernameInput = driver.findElement(By.name("txtUsername"));
        WebElement passwordInput = driver.findElement(By.name("txtPassword"));
        usernameInput.sendKeys("test123");
        Thread.sleep(2000);
        usernameInput.clear();
        Thread.sleep(2000);
        usernameInput.sendKeys("Yoll academy");
        Thread.sleep(2000);
        passwordInput.sendKeys("testtest");
        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        Thread.sleep(3000);
        loginButton.click();
        driver.quit();
    }
}
