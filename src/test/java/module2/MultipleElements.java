package module2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultipleElements {



        public static void main(String[] args) throws InterruptedException {

            // Create a WebDriver object
            WebDriver driver = new ChromeDriver();
            driver.get("https://demowebshop.tricentis.com/");
            List<WebElement> topMenuOptions = driver.findElements(By.xpath("//ul[@class='top-menu']//div[@class='top-menu-triangle']"));
            System.out.println("Items found: " + topMenuOptions.size());
            //WebElement register = driver.findElement(By.linkText("United States"));
            //register.click();
            // Locate the web elements we want to interact with:
            //WebElement searchInput = driver.findElement(By.id("gh-search-input"));
            //WebElement searchButton = driver.findElement(By.className("header-search-button"));

            // Interact with located elements
            //searchInput.sendKeys("iPhone 15");

            //searchButton.click();
            //Thread.sleep(2000);

            // Collect all the items from result
            // findElements() returns - a List<WebElements>

            // If want to know how many elements are in the list
            // Iterate over the list
            // loop - for, while, for each, do while
            // In for each loop we use 3 components:
            // 1. What is the data type of your elements -  WebElement
            // 2. How do you want to call the current element - product
            // 3. What is the source? The list we want to use - products
            //for(WebElement product : products){
                // Lets print the titles in our console
                //String text = product.getText();
                //System.out.println("Title: " + text);

               // Thread.sleep(1000);

               // if(text.toLowerCase().contains("iphone 15 pro")){ // iPhone
                    //System.out.println("Item Relevant");
                //} else {
                   // System.err.println("Item Irrelevant");
                //}

            //}

            driver.quit();

        }

    }