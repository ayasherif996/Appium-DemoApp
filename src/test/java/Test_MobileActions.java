//import Actions.MobileActions;
//import com.beust.ah.A;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//
//public class Test_MobileActions {
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setupDevice() throws MalformedURLException {
//        String AppName = System.getProperty("user.dir") + "/src/test/resources/TestDataFiles/ApiDemos-debug.apk";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:deviceName", "Demo");
//        caps.setCapability("appium:app", AppName);
//        caps.setCapability("appium:platformVersion", "14.0");
//        caps.setCapability("appium:automationName", "UiAutomator2");
//        driver = new AndroidDriver(new URL("http://localhost:4723/"), caps);
//    }
//
//    @Test
//    public void testClickAction() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(new AppiumBy.ByAccessibilityId("Access'ibility")).click();
//        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
//    }
//
//    @Test
//    public void testTyping() {
//        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(AppiumBy.accessibilityId("App")).click();
//        driver.findElement(AppiumBy.accessibilityId("Activity")).click();
//        driver.findElement(AppiumBy.accessibilityId("Custom Title")).click();
//        driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text_edit")).clear();
//        driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text_edit")).sendKeys("Appium");
//        driver.findElement(AppiumBy.accessibilityId("Change Left")).click();
//        // Actual Appium word
//        Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text")).getText(),"Appium");
//    }
//
//    @Test
//    public void testCheckBox() {
//        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
//   driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
//   driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
//   /*
//   another xpath to locate checkbox
////android.widget.TextView[@content-desc="Task Conquer World"]/parent::android.widget.LinearLayout/android.widget.CheckBox
//        */
//   driver.findElement(AppiumBy.xpath("(//*[@resource-id='io.appium.android.apis:id/tasklist_finished'])[3]")).click();
//   Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//*[@resource-id='io.appium.android.apis:id/tasklist_finished'])[3]")).getAttribute("checked"),"true","CheckBox checked");
//
//    }
//    @Test
//    public void testScrolling() {
//        // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
//        driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
//        MobileActions action = new MobileActions(driver);
//        action.scrollDownToSpecificText("ScaleToFit");
//        driver.findElement(AppiumBy.accessibilityId("ScaleToFit")).click();
//        Assert.assertEquals(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Graphics/ScaleToFit']")).getText(),"Graphics/ScaleToFit");
//
//    }
//
//    @Test
//    public void testSwiping() {
//        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
//        driver.findElement(AppiumBy.accessibilityId("Graphics")).click();
//        MobileActions action = new MobileActions(driver);
//        action.scrollDownToSpecificText("Vertices");
//        driver.findElement(AppiumBy.accessibilityId("Vertices")).click();
//        action.swipeRightOnElement(AppiumBy.xpath("(//android.view.View)[1]"),driver);
//        action.swipeLeftOnElement(AppiumBy.xpath("(//android.view.View)[1]"));
//
//
//    }
//
//
//    @Test
//    public void testRadioButton() {
//        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        MobileActions action = new MobileActions(driver);
//        action.scrollDownToSpecificText("Radio Group");
//        driver.findElement(AppiumBy.accessibilityId("Radio Group")).click();
//        driver.findElement(AppiumBy.accessibilityId("All of them")).click();
//     Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("All of them")).getAttribute("checked"),"true","radio checked");
//
//
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//}
