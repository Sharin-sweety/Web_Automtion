package Util;

import org.apache.hc.core5.reactor.Command;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrowserUrl {
    private static final Logger logger = LoggerFactory.getLogger(BrowserUrl.class);
    private WebDriver driver;

    public void startBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://164.52.217.3/ITrace-test/");
        logger.info("Opened Qu2i website");
    }
}
