package module2.TablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablePracticeHomework {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://practice.expandtesting.com/tables");
        System.out.println("Page Title: " + driver.getTitle());
        String lName = "Doe";
        String fName = "Jason";
        printEmailByFullName(driver, lName, fName);
        double expectedTotal= 251.0;
        double actualTotal=getTotalAmountOfDueColumn(driver);
        if(expectedTotal==actualTotal){
            System.out.println("TEST: PASSED");
        }else{
            System.out.println("TEST: FAILED");
        }

        driver.quit();
    }

    public static void printEmailByFullName(WebDriver driver, String lName, String fName) {
        String dynamicFullName = "//table[@id='table1']/tbody//*[text()='" + lName + "']/..//*[text()='" + fName + "']/..//td[3]";
        WebElement element;
        try {
            element = driver.findElement(By.xpath(dynamicFullName));
            String email = element.getText();
            System.out.println(email);
        } catch (NoSuchElementException e) {
            System.out.println("No such record found in table.");
        }

    }

    public static double getTotalAmountOfDueColumn(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"));
        double total = 0;
        for (WebElement element : elements) {
            String amount = element.getText();
            String amountDouble = amount.substring(1);
            total += Double.parseDouble(amountDouble);
        }
        return total;
    }

}

