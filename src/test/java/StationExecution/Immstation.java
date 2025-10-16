package StationExecution;

import Util.BrowserUrl;
import Util.UserLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;

public class Immstation {
    private static final Logger logger = LoggerFactory.getLogger(Immstation.class);
    private static WebDriver driver;

    public void loginIntoIMMStation() {
        login();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        generateQR();
        entervalue();
    }
    public void login(){
        UserLogin userLogin=new UserLogin();
        userLogin.Qu2ilogin();
    }

    public void generateQR() {
        driver.findElement(By.xpath("//*[normalize-space(text())='Generate QR Code']")).click();
        logger.info("Click Generate QR code for the component ");

        driver.findElement(By.xpath("//button[normalize-space(text())='validation Check']")).click();
        logger.info("Click on validation button ");

        driver.findElement(By.xpath("//svg[@class='lucide lucide-square-pen']")).click();
        logger.info("Click on edit button ");

        driver.findElement(By.xpath("//input[@id='«r6a»']")).sendKeys("qrcode");
        logger.info("Click on pass the component QRcode");

    }

    // Store all matching elements in a list
    public void entervalue() {
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@type='submit']"));

        if (!buttons.isEmpty()) {
            buttons.get(0).click();
            logger.info("The machine parameter validation appeared - IMM station");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        } else {
            logger.info("No validation screen appeared - proceeding without action");
        }
    }
}
