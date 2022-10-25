import org.testng.annotations.Test;

public class TestRunner extends AppiumTK {

    @Test
    public void clickEMIScreen() throws InterruptedException {

        TestCase testCase=new TestCase(driver);
        testCase.TKMobileNoEnter("01715321239");
        Thread.sleep(5000);

        /*TestCase.OTPEnter1("1234");
        Thread.sleep(3000);

        TestCase.OTPEnter2("2");
        Thread.sleep(3000);

        TestCase.OTPEnter3("3");
        Thread.sleep(3000);

        TestCase.OTPEnter4("4");
        Thread.sleep(3000);*/

        //testCase.otpPage();



    }
}
