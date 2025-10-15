package Util;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginComponent {

    private static final Logger logger = LoggerFactory.getLogger(UserLogin.class);
    private static WebDriver driver;

    public WebDriver stationLogin(){
        BrowserUrl browserUrl=new BrowserUrl();
        UserLogin userLogin=new UserLogin();//need to call browser method and login method separately here browser class contain login method also
        driver = browserUrl.Qu2iLogin();
//        browserUrl.startBrowser();
        logger.info("initiate launching browser");
//        userLogin.logIn(driver);
        logger.info("Login with the credentials");
        return driver;
    }
}
