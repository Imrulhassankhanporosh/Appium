import org.testng.annotations.Test;

public class TestRunner extends AppiumTK {

    @Test
    public void clickEMIScreen() throws InterruptedException {

        TestCase testCase=new TestCase(driver);
        testCase.TKMobileNoEnter("01715321555");
        Thread.sleep(5000);




        driver.getKeyboard().sendKeys("1234");
        Thread.sleep(5000);

        TestCase.OTPEnter();
        Thread.sleep(5000);

        TestCase.ShopNameEnter("Imrul Shop");
        Thread.sleep(5000);

        TestCase.AddCSButton1();
        Thread.sleep(5000);

        TestCase.Add_Supplier("Imrul", "01799433867", 10.00);
        Thread.sleep(5000);

        /*TestCase.Click_to_normal_txn(24.25, 120.50, "First normal Txn.");
        Thread.sleep(5000);

        TestCase.Adjust_to_normal_txn(24.25, 120.50);
        Thread.sleep(5000);*/

        TestCase.AddCSButton2();
        Thread.sleep(5000);

        TestCase.Add_Customer("Hassan", "01748789552", 15.15);
        Thread.sleep(5000);

        TestCase.Click_to_2nd_normal_txn();
        Thread.sleep(5000);


    }
}
