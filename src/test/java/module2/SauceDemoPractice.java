package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SauceDemoPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        String url="https://www.saucedemo.com/";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement usernameInput = driver.findElement(By.xpath("//input[@data-test='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        String userName="standard_user", password="secret_sauce";
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(3000);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("Url after login: "+currentUrl);
        WebElement sauceLabsBackpackAddToCartButton = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']"));
        sauceLabsBackpackAddToCartButton.click();

        Thread.sleep(3000);

        WebElement sauceLabsTShirtAddToCartButton = driver.findElement(By.xpath("//button[@name = 'add-to-cart-sauce-labs-bolt-t-shirt']"));
        sauceLabsTShirtAddToCartButton.click();

        Thread.sleep(3000);

        WebElement cartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartButton.click();
        Thread.sleep(3000);
        List<WebElement> productsInCart=driver.findElements(By.xpath("//div[@class='cart_item']"));
        int expectedItemsInCart =2;
        int actualItemsInCart = productsInCart.size();
        if(expectedItemsInCart == actualItemsInCart){
            System.out.println("TEST: PASSED");
            System.out.println("Expected items in the cart: " + expectedItemsInCart);
            System.out.println("Actual items in the cart: " + actualItemsInCart);
        } else {
            System.err.println("TEST: FAILED");
            System.err.println("Expected items in the cart: " + expectedItemsInCart);
            System.err.println("Actual items in the cart: " + actualItemsInCart);
        }


        driver.quit();
    }
}


