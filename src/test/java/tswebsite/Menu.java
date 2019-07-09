package tswebsite;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;


public class Menu {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/tswebsite/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.tribalscale.com/");
    }

    @Test(priority = 2)
    public void checkingForMenuButton() {
        driver.findElement(By.className("src-components-Header----index-module---navButtonContainer---2zZcJ")).click();
        Assert.assertTrue(driver.findElement(By.className("src-components-Header----index-module---navButtonContainer---2zZcJ")).isDisplayed());

    }

    @Test(priority = 3)
    public void checkingForWorkButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[1]/div")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[1]/div")).isDisplayed());

    }

    @Test(priority = 4)
    public void checkingForServicesButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[2]/div")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[2]/div")).isDisplayed());

    }

    @Test(priority = 5)
    public void checkingForPeopleButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[3]/div")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[3]/div")).isDisplayed());


    }

    @Test(priority = 6)
    public void checkingForCommunityButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[4]/div")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[4]/div")).isDisplayed());

    }

    @Test(priority = 7)
    public void checkingForCareersButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[5]/div")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[5]/div")).isDisplayed());

    }

    @Test(priority = 8)
    public void checkingForVentureStudios() {
        driver.findElement((By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[6]/div"))).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[6]/div")).isDisplayed());
    }

    @Test(priority = 9)
    public void checkingForOffices() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[3]")).isDisplayed();
    }

    @Test(priority = 10)
    public void clickingFacebookButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[1]/div[3]/a")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test(priority = 11)
    public void clickingTwitterButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test(priority = 12)
    public void clickingLinkedinButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/a")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));

    }

    @Test(priority = 13)
    public void clickingInstagramButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[1]/div[4]/a")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }

    @Test(priority = 14)
    public void clickingBlogButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navContainer\"]/div/div")).click();
    }

    @Test(priority = 15)
    public void clickingNewsletterButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[1]/div[4]/a")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.close();
        driver.switchTo().window(tabs2.get(0));
    }
    @Test(priority = 16)
    public void clickingPrivacyButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[2]/div/div[2]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navContainer\"]/div/div")).click();
    }
    @Test(priority = 17)
    public void checkingForOfficeLocation() {


    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }


}
