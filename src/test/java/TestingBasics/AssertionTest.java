package TestingBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertionTest {
    @Test
    public void verifyCondition(){


        int itemOnPage = 10;
        boolean itemsPresent = itemOnPage == 10;
        Assert.assertTrue(itemsPresent, "Items on page verification failed!");

        String title = "Google";
        Assert.assertTrue(title.equals("Google"), "The title verification failed! Expected: Google, Actual: " + title);

    }

    @Test
    public void verifyConditionFalse(){

        boolean buttonIsEnabled = false;
        Assert.assertFalse(buttonIsEnabled, "Button verification failed, it appears enabled!");
    }

    @Test
    public void verifyDbConnection() {

        boolean isDbConnected = true;
        if (!isDbConnected) {
            Assert.fail("The data base connection not successful.");
        }
    }
       // @Test
       public void testFileProcessing() {

            File file = new File("text.txt");
            try {
                Scanner scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                Assert.fail("The file was not found!");
            }


        }
    }