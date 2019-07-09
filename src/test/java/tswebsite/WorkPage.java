package tswebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WorkPage {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/tswebsite/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.tribalscale.com/work");

    }

    @Test(priority = 1)
    public void checkingForHeader() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/h1"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/h1")).isDisplayed());

    }

    @Test(priority = 2)
    public void checkingForAll6WorkTiles() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div"));
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div")).isDisplayed());

    }

    @Test(priority = 3)
    public void clickingViewCaseStudyAthos(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[1]/a/div[3]"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[1]/a/div[3]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[1]/a/div[3]"))).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div")).isDisplayed());
        driver.navigate().back();

    }

    @Test(priority = 4)
    public void clickingViewCaseStudyABC(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[2]/a/div[3]"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[2]/a/div[3]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[2]/a/div[3]"))).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div")).isDisplayed());
        driver.navigate().back();
    }

    @Test(priority = 5)
    public void clickingViewCaseStudyPGATour(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[3]/a/div[3]"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[3]/a/div[3]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[3]/a/div[3]"))).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div")).isDisplayed());
        driver.navigate().back();

    }

    @Test(priority = 6)
    public void clickingViewCaseStudyCBC(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[4]/a/div[3]"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[4]/a/div[3]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[4]/a/div[3]"))).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div")).isDisplayed());
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void clickingViewCaseStudyREDTAG(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[5]/a/div[3]"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[5]/a/div[3]"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[5]/a/div[3]"))).click().build().perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div")).isDisplayed());
        driver.navigate().back();
    }

    @Test(priority = 8)
    public void clickingYourProjectTile(){
        //*[@id="___gatsby"]/div/div[2]/div/div[1]/div/div[6]/div/span
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[6]/div/span"));
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[6]/div/span"));
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[1]/div/div[6]/div/span"))).click().build().perform();

    }

    @Test(priority = 9)
    public void clickingCloseButton(){
        driver.findElement(By.xpath("//*[@id=\"react-aria-modal-dialog\"]/div/div/div[1]/div")).click();
        
    }

    @Test(priority = 10)
    public void checkingForWhereWeWorkHeader(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/h1")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/h1")).isDisplayed());

    }

    @Test(priority = 11)
    public void checkingForWhereWeWorkTiles(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]"));
        action.moveToElement(element).perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]")).isDisplayed());

    }

    @Test(priority = 12)
    public void checkingForABCTile(){

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[1]"));
        action.moveToElement(element).perform();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[1]")).isDisplayed());

    }

    @Test(priority = 13)
    public void checkingForAAATile(){
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[2]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[2]")).isDisplayed());

    }

    @Test(priority = 14)
    public void checkingForAthosTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[3]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[3]")).isDisplayed());

    }

    @Test(priority = 15)
    public void checkingForAutonomicTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[4]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[4]")).isDisplayed());

    }

    @Test(priority = 16)
    public void checkingForBenecaidTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[5]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[5]")).isDisplayed());

    }

    @Test(priority = 17)
    public void checkingForBloombergTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[6]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[6]")).isDisplayed());

    }

    @Test(priority = 18)
    public void checkingForCBCTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[7]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[7]")).isDisplayed());

    }

    @Test(priority = 19)
    public void checkingForCBSRadioTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[8]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[8]")).isDisplayed());

    }

    @Test(priority = 20)
    public void checkingForCIBCTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[9]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[9]")).isDisplayed());

    }

    @Test(priority = 21)
    public void checkingForHelpfulTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[10]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[10]")).isDisplayed());

    }

    @Test(priority = 22)
    public void checkingForPGATile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[11]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[11]")).isDisplayed());

    }

    @Test(priority = 23)
    public void checkingForRedTagTile() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[12]")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[2]/div/div/img[12]")).isDisplayed());

    }

    @Test(priority = 24)
    public void checkingForYouMightAlsoBeInterestedInHeader() {
        driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[3]/div/h1")).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[2]/div/div[3]/div/h1")).isDisplayed());
    }

    @AfterClass
    public void tearDown () {
        driver.quit();
        }

    }
