package Util;

import Phase1_Station.IMMStation;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Automate {
    private static final Logger logger= LoggerFactory.getLogger(Automate.class);
    UserLogin adminLoginAutomation ;
    WebDriver driver;

//    public static void main(String[] args) {
//        System.out.println("Hello");
//         = new ChromeDriver();
//
////        Actions actions = new Actions(driver);
//        logger.info("Action Performed");
//
//
//
//        driver.get("https://www.flipkart.com/");// enoda web link
//
//        WebElement productName = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//        productName.sendKeys("IPhone");
//        productName.sendKeys(Keys.ENTER);
//
//    }
    public void runTrace(){
        stationExecution();
//        IMM stationExecution()
        // Paint stationExecution()
        //Maka stationExecution()
    }

    public void stationExecution(){
        //login call
    adminLoginAutomation=new UserLogin();
//    adminLoginAutomation.logIn(driver);
    //Param Station Call
        IMMStation immStation=new IMMStation();
//        immStation.
        //Logout Call
    }

}
