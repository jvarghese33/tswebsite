package tswebsite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    @Test (priority = 2)
    public void checkingForMenuButton() {
        driver.findElement(By.className("src-components-Header----index-module---navButtonContainer---2zZcJ")).click();

    }
    @Test (priority = 3)
    public void checkingForWorkButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[1]/div")).isDisplayed();
//        driver.findElement(By.xpath("//*[@id=\"navContainer\"]/div/div/p")).click();

    }
    @Test (priority = 4)
    public void checkingForServicesButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[2]/div")).isDisplayed();

    }
    @Test (priority = 5)
    public void checkingForPeopleButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[3]/div")).isDisplayed();

    }
    @Test (priority = 6)
    public void checkingForCommunityButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[4]/div")).isDisplayed();

    }
    @Test (priority = 7)
    public void checkingForCareersButton() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[5]/div")).isDisplayed();

    }
    @Test (priority = 8)
    public void checkingForVentureStudios() {
        driver.findElement((By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[1]/div[6]/div"))).isDisplayed();
    }
    @Test (priority = 9)
    public void checkingForOffices() {
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[2]/div/div[3]")).isDisplayed();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        }
    }