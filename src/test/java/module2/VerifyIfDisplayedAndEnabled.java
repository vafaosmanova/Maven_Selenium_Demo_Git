package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyIfDisplayedAndEnabled {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(1000);
        String userEmail = "testautoman@email.com";
        String password = "qwerty123!";
        WebElement signInButton = driver.findElement(By.partialLinkText("Sign In"));
        signInButton.click();
        Thread.sleep(1000);
        WebElement userEmailInput = driver.findElement(By.id("email"));
        userEmailInput.sendKeys(userEmail);
        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys(password);
        Thread.sleep(1000);
        WebElement signinButton = driver.findElement(By.id("send2"));
        signinButton.click();
        Thread.sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Title is: "+ driver.getTitle());
        Thread.sleep(1000);
        WebElement welcomeButton = driver.findElement(By.xpath("(//*[text()='Welcome, Test Automan!'])[1]"));
        String textWelcome = welcomeButton.getText();
        System.out.println(textWelcome);
        if(textWelcome.startsWith("Welcome")) {
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        driver.quit();

    }

}
