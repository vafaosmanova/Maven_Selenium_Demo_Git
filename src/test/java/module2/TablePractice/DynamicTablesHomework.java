package module2.TablePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTablesHomework {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        System.out.println("Page Title: " + driver.getTitle());
        String actElement="";
            List<WebElement> elements =driver.findElements(By.xpath("//table[@class='table table-striped']//tr/th"));
            for(WebElement element : elements){
                    if (element.getText().equals("CDU")) {
                      int indexCDU = elements.indexOf(element)+1;
                        WebElement actualElement = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody//*[text()='Chrome']/../td["+indexCDU+"]"));
                        actElement= actualElement.getText();
                    }
                }

                   WebElement expectedElement = driver.findElement(By.xpath("//table[@class='table table-striped']//..//..//p[@id='chrome-cpu']"));
                        String expElement = expectedElement.getText();

                        if(expElement.endsWith(actElement)){
                            System.out.println("TEST: PASSED");
                        }else{
                            System.out.println("TEST: FAILED");
                        }

    driver.quit();
        }
    }

