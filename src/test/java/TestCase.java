import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.*;


public class TestCase {

    public AndroidDriver driver;

    //Mobile No page

    @FindBy(id = "com.progoti.tallykhata:id/et_mobile_number")
    public
    MobileElement mobileNumber;

    @FindBy(id = "com.progoti.tallykhata:id/btn_next")
    public
    MobileElement nextBtn1;

   // new Actions(driver).sendKeys(text).perform();



   //OTP page

    /*@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    @FindBy(id = "com.progoti.tallykhata:id/pinEntryViewOtp")
    public static
    MobileElement otp1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
    public static
    MobileElement otp2;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]")
    public static
    MobileElement otp3;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]")
    public static
    MobileElement otp4;*/

    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    public static
    MobileElement nextBtn2;




    public TestCase(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }





    public void TKMobileNoEnter(String mobileNo) {

        mobileNumber.sendKeys("" + mobileNo + "");
        nextBtn1.click();

        //driver.findElement(By.id("com.progoti.tallykhata:id/pinEntryViewOtp")).sendKeys("1234");

        //driver.findElement(By.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")).sendKeys("1");

       // nextBtn2.click();


    }


   /* @FindBy(id= "com.progoti.tallykhata:id/pinEntryViewOtp")
    // @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    public
    MobileElement element;*/



    //public Actions action = new Actions(driver);


    /*public void otpPage() {


        Point location = element.getLocation();

        //System.out.print("location is : " +location);

       // element.sendKeys("1");

        //action.sendKeys(element, "1234").build().perform();

         driver.getKeyboard().sendKeys("1234");

       // nextBtn2.click();
    }*/







    /*public static void OTPEnter1(String otp) {

        //otp1.click();
        //otp1.sendKeys(Integer.toString(Integer.parseInt(otp)));
        otp1.sendKeys(otp);


    }

    public static void OTPEnter2(String otp) {

        otp2.sendKeys("" + otp + "");


    }

    public static void OTPEnter3(String otp) {

        otp3.sendKeys("" + otp + "");


    }

    public static void OTPEnter4(String otp) {

        otp4.sendKeys("" + otp + "");
        nextBtn2.click();


    }*/




}
