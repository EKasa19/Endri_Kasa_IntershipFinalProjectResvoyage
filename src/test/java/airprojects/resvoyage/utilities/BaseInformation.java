package airprojects.resvoyage.utilities;
import airprojects.resvoyage.globals.Globals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseInformation {
    public static BaseInformation getBaseInformation(){
        return new BaseInformation();
    }
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if(driver == null){
            String browserType = Globals.driverType;
            switch (browserType){
                case "chrome":
                    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driver;
    }
    public static void quit() {
        driver.quit();
    }
}
