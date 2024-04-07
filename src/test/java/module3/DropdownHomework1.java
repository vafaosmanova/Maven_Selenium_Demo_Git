package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHomework1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        String predefinedMonth="November";
        Select monthDropdown = new Select(driver.findElement(By.xpath("//*[@placeholder='Month']")));
       List<WebElement> listOfMonth=monthDropdown.getOptions();
        for(int i=1; i<listOfMonth.size(); i++){
            System.out.println(listOfMonth.get(i).getText());
            if(listOfMonth.get(i).getText().equals(predefinedMonth)){
                break;
            }
        }

        driver.quit();
    }
}
