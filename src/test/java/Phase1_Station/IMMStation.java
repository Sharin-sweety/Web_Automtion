package Phase1_Station;

import Util.LoginComponent;
import Util.BrowserUrl;
import com.google.common.annotations.VisibleForTesting;
//import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class IMMStation {

    private static final Logger logger = LoggerFactory.getLogger(BrowserUrl.class);
    private static WebDriver driver;

    @Test

    public static void main(String[] arg) {
        IMMStation immStation = new IMMStation();

        driver = immStation.loginIntoIMMStation();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        immStation.generateQR(driver,"TC01QLXXX252610002");
    }

    public WebDriver loginIntoIMMStation() {
        LoginComponent loginComponent = new LoginComponent();
        // stationLogin should initialize driver and assign it here
        driver = loginComponent.stationLogin();
        return driver;
    }

    public void generateQR(WebDriver driver,String qrCode) {

//        driver.findElement(By.xpath("//*[normalize-space(text())='Generate QR Code']")).click();
//        logger.info("Click Generate QR code for the component ");

        driver.findElement(By.xpath("//button[normalize-space(text())='validation Check']")).click();
        logger.info("Click on validation button ");

        driver.findElement(By.xpath("//svg[@class='lucide lucide-square-pen']")).click();

        //(//span[@class='MuiTouchRipple-root css-4mb1j7'])[last()]

//        //button[@class="MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1np9dvu"]

        logger.info("Click on edit button ");

        driver.findElement(By.xpath("//input[@id='«r6a»']")).sendKeys(qrCode);
        logger.info("Click on pass the component QRcode");




    }
}




        // Store all matching elements in a list
//        List<WebElement> buttons = driver.findElements(By.xpath("//button[@type='submit']"));
//
//        if (!buttons.isEmpty()) {
//            buttons.get(0).click();
//            logger.info("The machine parameter validation appeared - IMM station");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//        } else {
//            logger.info("No validation screen appeared - proceeding without action");
//        }






//     try {
//        // Load the PDF file
//        File file = new File("C:\\path\\to\\your\\file.pdf");
//        PDDocument document = PDDocument.load(new FileInputStream(file));
//

//        // Render PDF page as image
//        PDFRenderer pdfRenderer = new PDFRenderer(document);
//        BufferedImage bufferedImage = pdfRenderer.renderImageWithDPI(0, 300); // page 0, 300 DPI
//
//        // Save image temporarily (optional)
//        ImageIO.write(bufferedImage, "png", new File("qr_page.png"));
//
//        // Decode QR from image
//        BinaryBitmap bitmap = new BinaryBitmap(
//                new HybridBinarizer(
//                        new BufferedImageLuminanceSource(bufferedImage)
//                )
//        );
//
//        Result result = new MultiFormatReader().decode(bitmap);
//        System.out.println("QR Code value: " + result.getText());
//
//        document.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }


