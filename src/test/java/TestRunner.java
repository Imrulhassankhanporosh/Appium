import org.testng.annotations.Test;

public class TestRunner extends AppiumTK {

    @Test
    public void clickEMIScreen() throws InterruptedException {

        TestCase testCase=new TestCase(driver);
        testCase.TKMobileNoEnter("01715321540");
        Thread.sleep(5000);




        driver.getKeyboard().sendKeys("1234");
        Thread.sleep(5000);

        TestCase.OTPEnter();
        Thread.sleep(5000);

        TestCase.ShopNameEnter("Imrul Shop");
        Thread.sleep(5000);

        TestCase.AddCSButton();
        Thread.sleep(5000);

        TestCase.AddCS("Imrul", "01799433867", 10.00);
        Thread.sleep(5000);


    }
}
