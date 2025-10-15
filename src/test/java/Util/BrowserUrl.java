package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowserUrl {

    private static final Logger logger = LoggerFactory.getLogger(BrowserUrl.class);
    private static WebDriver driver;

    public void startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://164.52.217.3/ITrace-test/");
        driver.manage().window().maximize();
        logger.info("Opened Qu2i website");
    }

//    public static void main(String[] args) {

//    public WebDriver Qu2iLogin(){
//        BrowserUrl test = new BrowserUrl();
//        test.startBrowser();
//        UserLogin adminLoginAutomation = new UserLogin();
//        adminLoginAutomation.logIn(driver);
//        logger.info("initiate launching browser");
//        return driver;
//    }

    public WebDriver Qu2iLogin() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        driver = new EdgeDriver(options);
        driver.get("http://164.52.217.3/ITrace-test/");
        logger.info("Opened Qu2i website in Edge");
        return driver;
    }
//     System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); // Set your driver path
//     ((JavascriptExecutor) driver).executeScript("window.localStorage.setItem('bearer_token_key', 'Bearer " + bearerToken + "');");
//
//    driver.quit();
}
