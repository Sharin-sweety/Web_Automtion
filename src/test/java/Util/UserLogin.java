package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class UserLogin {
    private static final Logger logger = LoggerFactory.getLogger(UserLogin.class);
    private WebDriver driver;
//    public void logIn(WebDriver driver,String station)
    public void logIn(WebDriver driver) {
        this.driver = driver;
        selectRole("Operator");
//        selectRole("Admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        userName("admin");
        passWord("seed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
        selectStation("Injection molding"); // selectStation("station")

    }
    public void selectRole(String role) {
        String xpath = "//*[normalize-space(text())='" + role + "']";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement roleElement = wait.until( ExpectedConditions.elementToBeClickable(By.xpath(xpath)) );

//        roleElement.click();
        logger.info("Selected role");
    }
    public void userName(String userName) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);   // ✅ fixed
        logger.info("Entered username");
    }
    public void passWord(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);   // ✅ fixed
        logger.info("Entered password");
    }
    public void selectStation(String station) {
        logger.info("Selection of the station is indicated");
        WebElement selectInput = driver.findElement(By.xpath("(//fieldset[@class='MuiOutlinedInput-notchedOutline css-5v2ak0'])[last()]/ancestor::div[contains(@class,'MuiOutlinedInput-root')]//input"));
        selectInput.sendKeys(station);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        selectInput.sendKeys(Keys.ARROW_DOWN);//select for the drop down
        selectInput.sendKeys(Keys.ENTER);
        logger.info("Station Selected end");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        selectInput.sendKeys(Keys.ENTER);
        logger.info("Logged into the Web app" );
    }
}