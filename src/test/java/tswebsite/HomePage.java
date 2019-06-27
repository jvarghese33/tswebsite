package tswebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class HomePage {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/tswebsite/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.tribalscale.com/");
    }
    @Test (priority = 2)
    public void scrollingDownToFirstSetOfImageTiles() {
        WebElement element = driver.findElement(By.id("blockOneImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 3)
    public void scrollingDownToSecondSetOfImageTiles() {
        WebElement element = driver.findElement(By.id("blockTwoImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 4)
    public void scrollingDownToThirdSetOfImageTiles() {
        WebElement element = driver.findElement(By.id("blockThreeImageSmall"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


//    @Test (priority = 5)
//    public void scrollingDownToFourthSetOfImageTiles() {
//        WebElement element = driver.findElement(By.id("blockFourthImageSmall"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }

    @Test (priority = 6)
    public void scrollingDownToVoiceIsTheFutureBlock() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div/div[2]/div[7]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


//    @Test
//    public void selectingTheHomePage() {
//        driver.findElement(By.xpath("//*[@id=\"navContainer\"]/div/a/svg")).isDisplayed();
//        driver.findElement(By.xpath("//*[@id=\"navContainer\"]/div/div/svg/path")).click();
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}