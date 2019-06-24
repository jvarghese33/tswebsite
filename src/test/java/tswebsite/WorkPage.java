package tswebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class WorkPage {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/tswebsite/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.tribalscale.com/services");
    }
    @Test (priority = 2)
    public void checkingForFirstImage() {
        WebElement element = driver.findElement(By.id("blockOneImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 3)
    public void checkingForSecondImage() {
        //this is checking the second image in the first set which is the "larger" one
        WebElement element = driver.findElement(By.id("blockOneImageLarge"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 4)
    public void checkingForThirdImage() {
        //This is checking the first image of the second set of images, which the "larger" of the two images
        WebElement element = driver.findElement(By.id("blockTwoImageLarge"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 5)
    public void checkingForTheFourthImage() {
        WebElement element = driver.findElement(By.id("blockTwoImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
        @AfterClass
        public void tearDown () {
            // driver.quit();
        }

    }