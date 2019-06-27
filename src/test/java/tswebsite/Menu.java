package tswebsite;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


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
        driver.findElement(By.xpath("//*[@id=\"u_0_y\"]/div[2]/a/span[1]")).click();

       // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
    }
    @Test (priority = 11)
    public void closingCurrentTab() {
        try {
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
        driver.findElement(By.xpath("//*[@id=\"u_0_g\"]/div[7]/a")).sendKeys(Keys.COMMAND + "w");
    }

    @AfterClass
    public void tearDown() {
    }
//      driver.quit();
}