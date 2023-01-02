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

   // @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    @FindBy(id = "com.progoti.tallykhata:id/pinEntryViewOtp")
    public
    MobileElement otp1;


    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    public static
    MobileElement nextBtn2;

    // Shop Name Page

    // @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    @FindBy(id = "com.progoti.tallykhata:id/et_shop_name")
    public static
    MobileElement ShopName;

    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    public static
    MobileElement nextBtn3;

    //add customer button

    @FindBy(id = "com.progoti.tallykhata:id/add_customer")
    public static
    MobileElement AddCSButton;

    //add customer/supplier page


    @FindBy(id = "com.progoti.tallykhata:id/etCustomerOrSupplier")
    public static
    MobileElement CS_name;

    @FindBy(id = "com.progoti.tallykhata:id/etMobileNumber")
    public static
    MobileElement CS_mobile_no;

    @FindBy(id = "com.progoti.tallykhata:id/etMobileNumber")
    public static
    MobileElement CS_jer_amount;

    @FindBy(id = "com.progoti.tallykhata:id/btnSupplier")
    public static
    MobileElement Select_Supplier_Option;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    public static
    MobileElement nextBtn4;








    public TestCase(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }





    public void TKMobileNoEnter(String mobileNo) {

        mobileNumber.sendKeys("" + mobileNo + "");
        nextBtn1.click();

    }


    public static void OTPEnter() {

        nextBtn2.click();


    }

    public static void ShopNameEnter(String shop_name) {


        ShopName.sendKeys("" + shop_name+ "");
        nextBtn3.click();

    }

    public static void AddCSButton()
    {
        AddCSButton.click();
    }

    public static void AddCS(String customer_name, String customer_mobile_no, Double jer_amount) throws InterruptedException {


        //if you waant to add supplier

        Select_Supplier_Option.click();
        Thread.sleep(3000);

        CS_name.sendKeys("" + customer_name + "");
        Thread.sleep(3000);

        CS_mobile_no.sendKeys("" + customer_mobile_no + "");
        Thread.sleep(3000);

        CS_jer_amount.sendKeys("" + jer_amount + "");
        Thread.sleep(3000);

        nextBtn4.click();
    }





}
