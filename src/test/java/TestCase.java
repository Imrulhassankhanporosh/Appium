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

    // For First time adding Customer/supplier


    @FindBy(id = "com.progoti.tallykhata:id/etCustomerOrSupplier")
    public static
    MobileElement CS_name;

    @FindBy(id = "com.progoti.tallykhata:id/etMobileNumber")
    public static
    MobileElement CS_mobile_no;

    @FindBy(id = "com.progoti.tallykhata:id/etCreditInput")
    public static
    MobileElement CS_jer_amount;

    @FindBy(id = "com.progoti.tallykhata:id/btnSupplier")
    public static
    MobileElement Select_Supplier_Option;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    public static
    MobileElement nextBtn4;

    //try to do normal txn in tally tab

    @FindBy(id = "com.progoti.tallykhata:id/layoutCustomerInfo")
    public static
    MobileElement Click_on_existing_customer;

    @FindBy(id = "com.progoti.tallykhata:id/etSale")
    public static
    MobileElement Dilam_Supplier;

    @FindBy(id = "com.progoti.tallykhata:id/etGot")
    public static
    MobileElement Pelam_supplier;

    @FindBy(id = "com.progoti.tallykhata:id/etDescription")
    public static
    MobileElement Txn_Description;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirmCreditEntry")
    public static
    MobileElement Confirm_button_normal_txn;

    @FindBy(id = "com.progoti.tallykhata:id/et_cash_sale")
    public static
    MobileElement Cash_becha_to_adjust;

    @FindBy(id = "com.progoti.tallykhata:id/et_malik_dilo")
    public static
    MobileElement Malik_dilo_to_adjust;

    @FindBy(id = "com.progoti.tallykhata:id/tv_yes_button")
    public static
    MobileElement Confirm_button_to_adjust;

    //clicking customer/supplier from tally tab using xpath when there are more than customer/supplier.

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout")
    public static
    MobileElement First_CS_from_list;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout")
    public static
    MobileElement Second_CS_from_list;








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

    public static void AddCSButton1()
    {
        AddCSButton.click();
    }

    public static void Add_Supplier(String customer_name, String customer_mobile_no, Double jer_amount) throws InterruptedException {


        //if you want to add supplier or else comment out next two line for adding customer

        Select_Supplier_Option.click();
        Thread.sleep(5000);

        CS_name.sendKeys("" + customer_name + "");
        Thread.sleep(5000);

        CS_mobile_no.sendKeys("" + customer_mobile_no + "");
        Thread.sleep(5000);

        CS_jer_amount.sendKeys("" + jer_amount + "");
        Thread.sleep(5000);

        nextBtn4.click();
    }

    public static void Click_to_normal_txn(Double Dilam, Double Pelam, String Description) throws InterruptedException {

        // do normal txn of added first supplier/customer

        Click_on_existing_customer.click();
        Thread.sleep(5000);

        Dilam_Supplier.sendKeys("" + Dilam + "");
        Thread.sleep(5000);

        Pelam_supplier.sendKeys("" + Pelam + "");
        Thread.sleep(5000);

        Txn_Description.sendKeys("" + Description + "");
        Thread.sleep(5000);

        Confirm_button_normal_txn.click();



    }


    public static void Adjust_to_normal_txn(Double cash_becha, Double malik_dilo) throws InterruptedException {


        Cash_becha_to_adjust.sendKeys("" + cash_becha + "");
        Thread.sleep(5000);

        Malik_dilo_to_adjust.sendKeys("" + malik_dilo + "");
        Thread.sleep(5000);


        Confirm_button_to_adjust.click();

    }

    public static void AddCSButton2()
    {
        AddCSButton.click();
    }


    public static void Add_Customer(String customer_name, String customer_mobile_no, Double jer_amount) throws InterruptedException {


        CS_name.sendKeys("" + customer_name + "");
        Thread.sleep(5000);

        CS_mobile_no.sendKeys("" + customer_mobile_no + "");
        Thread.sleep(5000);

        CS_jer_amount.sendKeys("" + jer_amount + "");
        Thread.sleep(5000);

        nextBtn4.click();
    }

    public static void Click_to_2nd_normal_txn() throws InterruptedException {

        // do normal txn of added 2nd supplier/customer

        Second_CS_from_list.click();
        /*Thread.sleep(5000);

        Dilam_Supplier.sendKeys("" + Dilam + "");
        Thread.sleep(5000);

        Pelam_supplier.sendKeys("" + Pelam + "");
        Thread.sleep(5000);

        Txn_Description.sendKeys("" + Description + "");
        Thread.sleep(5000);

        Confirm_button_normal_txn.click();*/



    }





}
