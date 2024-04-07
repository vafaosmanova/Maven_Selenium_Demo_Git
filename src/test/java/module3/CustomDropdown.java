package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.
        selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.bestbuy.com/?intl=nosplash");
        WebElement element = driver.findElement(By.cssSelector(".open-hamburger-icon"));
        element.click();
        Thread.sleep(5000);

        WebElement brandsOption = driver.findElement(By.xpath("//button[text()='Brands']"));
        brandsOption.click();
        Thread.sleep(5000);

        WebElement appleBrand = driver.findElement(By.cssSelector("a[data-lid='ubr_shp_apl']"));
        appleBrand.click();
        Thread.sleep(5000);

        driver.quit();

    }
}
