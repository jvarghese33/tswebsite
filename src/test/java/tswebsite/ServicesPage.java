package tswebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class ServicesPage {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/tswebsite/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.tribalscale.com/services");
    }
    @Test
    public void checkHeader() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/h1"));
        Assert.assertEquals("OUR SERVICES", driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/h1")).getText());

    }
    @Test (priority = 2)
    public void checkingForFirstImage() {
        WebElement element = driver.findElement(By.id("blockOneImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(driver.findElement(By.id("blockOneImageSmall")).isDisplayed());
    }
    @Test (priority = 3)
    public void checkingForSecondImage() {
        //this is checking the second image in the first set which is the "larger" one
        WebElement element = driver.findElement(By.id("blockOneImageLarge"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(driver.findElement(By.id("blockOneImageLarge")).isDisplayed());
    }

    @Test (priority = 4)
    public void checkingForThirdImage() {
    //This is checking the first image of the second set of images, which the "larger" of the two images
        WebElement element = driver.findElement(By.id("blockTwoImageLarge"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(driver.findElement(By.id("blockTwoImageLarge")).isDisplayed());
    }

    @Test (priority = 5)
    public void checkingForTheFourthImage() {
        WebElement element = driver.findElement(By.id("blockTwoImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Assert.assertTrue(driver.findElement(By.id("blockTwoImageSmall")).isDisplayed());
    }

    @Test (priority = 6)
    public void checkForFirstHeader() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/h1"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/h1")).isDisplayed());
    }


//    @Test (priority = 2)
//    public void checkingForSecondImage() {
//        WebElement element = driver.findElement(By.id("blockOneImageSmall"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }
//
//    @Test (priority = 3)
//    public void scrollingDownToSecondSetOfImageTiles() {
//        WebElement element = driver.findElement(By.id("blockTwoImageSmall"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }
//
//    @Test (priority = 4)
//    public void scrollingDownToThirdSetOfImageTiles() {
//        WebElement element = driver.findElement(By.id("blockThreeImageSmall"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}