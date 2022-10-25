import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppiumTK {

    public AndroidDriver driver;
    @BeforeTest
    public AndroidDriver AppiumTK() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Symphony Z30 pro");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "com.progoti.tallykhata");
        cap.setCapability("appActivity", "com.progoti.tallykhata.v2.customer_onboard.SplashScreenActivity");
        cap.setCapability("autoGrantPermissions", true);
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
   // @AfterTest
  //  public void closeApp(){


    //    driver.quit();

  //  }
}
