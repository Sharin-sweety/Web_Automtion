package Component;

import StationExecution.Immstation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class IMMComponent {
    private static WebDriver driver;

    public void immperform(){
        Immstation immstation=new Immstation();
        immstation.loginIntoIMMStation();
    }
    @AfterTest
    public void closeBrowser() {
            driver.close();  // ✅ closes only the current tab
            System.out.println("Closed current browser tab.");
        }
    }
