package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SwagLabsHomeWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        String  userName= "standard_user";
        String userPassword= "secret_sauce";
        WebElement userNameBox = driver.findElement(By.xpath("//*[@id='user-name']"));
        userNameBox.sendKeys(userName);
        Thread.sleep(1000);
        WebElement userPasswordBox = driver.findElement(By.xpath("//*[@id='password']"));
        userPasswordBox.sendKeys(userPassword);
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));
        loginButton.click();
        Thread.sleep(1000);
        WebElement header= driver.findElement(By.xpath("//*[@class='title']"));
        System.out.println("Successfully Logged In. Page header:  " + header.getText());
        if(header.getText().equals("Products")){
            System.out.println("Verify Page Header: PASSED.");
        }else{
            System.out.println("Verify Page Header: FAILED.");
        }
        List<WebElement> items = driver.findElements(By.xpath("//*[@class='inventory_item']"));
        System.out.println("Avialable items on Products page: " + items.size());
        if(items.size()==6){
            System.out.println("Verify Items Count: PASSED.");
        }else{
            System.out.println("Verify Items Count: FAILED.");
        }
        Thread.sleep(1000);
        String bikeLight = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']")).getText();
        if(Boolean.parseBoolean(bikeLight)){
            System.out.println("Verify 'Sauce Labs Bike Light' Presence: PASSED.");
        }else{
            System.out.println("Verify 'Sauce Labs Bike Light' Presence: FAILED.");
        }
        Thread.sleep(1000);
        WebElement tShirtAddToCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        if(tShirtAddToCart.isDisplayed() && tShirtAddToCart.isEnabled()){
            System.out.println("Verify \"ADD TO CART\" button Displayed and Enabled: PASSED.");
        }else{
            System.out.println("Verify \"ADD TO CART\" button Displayed and Enabled: FAILED.");
        }
        Thread.sleep(1000);
        WebElement textAddCart = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bike-light' and text()='Add to cart']"));
        String color = textAddCart.getCssValue("color");
        if(color.equals("rgba(19, 35, 34, 1)")){
            System.out.println("Verify Button Text Color: PASSED.");
        }else{
            System.out.println("Verify Button Text Color: FAILED.");
        }
        String border = textAddCart.getCssValue("border");

        if(border.endsWith("rgb(19, 35, 34)")){
          System.out.println("Verify Button Border Color: PASSED.");
        }else{
           System.out.println("Verify Button Border Color: FAILED.");
       }
        tShirtAddToCart.click();
        System.out.println("Clicked ADD TO CART button.");
        System.out.println("Current button displayed text: Remove.");
        Thread.sleep(1000);
        WebElement remove = driver.findElement(By.xpath("//*[@id='remove-sauce-labs-bolt-t-shirt']"));
        if(remove.isDisplayed()){
            System.out.println("Verify Button Text: PASSED.");
        }else{
            System.out.println("Verify Button Text: FAILED.");
        }
        String tShirtColor = remove.getCssValue("color");
        if(tShirtColor.equals("rgba(226, 35, 26, 1")){
          System.out.println("Verify Button Text Color: PASSED.");
        }else{
           System.out.println("Verify Button Text Color: FAILED.");
        }
        String tShirtBorder = remove.getCssValue("border");

        if(tShirtBorder.endsWith("rgb(226, 35, 26)")){
          System.out.println("Verify Button Border Color: PASSED.");
        }else{
            System.out.println("Verify Button Border Color: FAILED.");
        }
        WebElement shoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        shoppingCart.click();
        Thread.sleep(1000);
        System.out.println("Clicked Cart button.");
        System.out.println("Item in the cart: 1.");
        List<WebElement> quantityButton = driver.findElements(By.xpath("//*[@class='cart_item']"));
        if(quantityButton.size()==1){
            System.out.println("Verify Cart Items: PASSED.");
        }else{
            System.out.println("Verify Cart Items: FAILED.");
        }

        driver.quit();
    }
}

