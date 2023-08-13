import Pages_Pom.*;
import Utils.JsonFileManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.time.Duration;

public class TestMobileActionsForPom {
    JsonFileManager TestData;
    JsonFileManager graphicsScaleToFitTestData;
    JsonFileManager AccessibilityNodeProviderData;
    WebDriver driver;
  //  TestConfigurations tconfg = new TestConfigurations(driver);

    @BeforeMethod
    public void setupDevice() throws MalformedURLException {
        driver = new SetUpPage(driver).setupDevice();
    }

    @BeforeClass
    public void initializeJsonFileManager() throws MalformedURLException {

        TestData= new JsonFileManager("src//test//resources//TestDataFiles//TestData.json");
        AccessibilityNodeProviderData  = new JsonFileManager("src//test//resources//TestDataFiles//AccessibilityNodeProviderData.json");
        graphicsScaleToFitTestData = new JsonFileManager("src//test//resources//TestDataFiles//graphicsScaleToFitPageTestData.json");
    }

    @Test
    public void testClickAction() {
        new HomePage(driver).clickOnAccessibilityButton()
                .assertOnAccessibilityNodeProviderText(AccessibilityNodeProviderData.getTestData("AccessibilityNodeProviderTextExpectedResult"));
    }

    @Test
    public void testTyping() throws FileNotFoundException {
         // setupDevice();
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new HomePage(driver).clickOnAppButton();
        new AppPage(driver).clickOnActivityButton();
        new ActivityPage(driver).clickOnCustomTitleButton();
        new CustomTitlePage(driver).clearTextField1();
        new CustomTitlePage(driver).enterTextInTextField(TestData.getTestData("textField"));
        new CustomTitlePage(driver).clickOnChangeLeftButton();
        // Actual Appium word
        Assert.assertEquals(driver.findElement(AppiumBy.id("io.appium.android.apis:id/left_text")).getText(),"Appium");
    }

    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
      new HomePage(driver).clickOnAccessibilityButton();
      new FirstAccessibilityPage(driver).clickOnaccessibilityNodeQueryingButton();
      new AccessibilityNodeQueryingPage(driver).clickOnCheckBox();
      Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//*[@resource-id='io.appium.android.apis:id/tasklist_finished'])[3]")).getAttribute("checked"),"true","CheckBox checked");
    }




    @Test
    public void testScrolling() {
 // Navigate to Graphics , scaleToFit and click on it and check If it's scrolled and clicked or not
        new HomePage(driver).clickOnGraphicsButton();
        new GraphicsPage(driver).scrollToScaleToFitElement();
        new GraphicsPage(driver).clickOnScaleToFitButton();
        new GraphicsThenScaleToFitPage(driver).assertOnGraphicsScaleToFit(graphicsScaleToFitTestData.getTestData("graphicsScaleToFitTestDataExpectedResult"));
      //  Assert.assertEquals(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Graphics/ScaleToFit']")).getText(),"Graphics/ScaleToFit");

    }

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left
       new HomePage(driver).clickOnGraphicsButton();
       new GraphicsPage(driver).scrollToVertices();
       new GraphicsPage(driver).clickOnVerticesButton();
       new GraphicsThenVerticesPage(driver).swipePhotoRight();
       new GraphicsThenVerticesPage(driver).swipePhotoLeft();

    }

    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
      new HomePage(driver).ClickOnviewsButton();
      new ViewPage(driver).scrollToRadioGroupElement();
      new ViewPage(driver).clickOnRadioGroupElement();
      new ViewThenRadioGroupPage(driver).clickOnallOfThemChoice();
     Assert.assertEquals(driver.findElement(AppiumBy.accessibilityId("All of them")).getAttribute("checked"),"true","radio checked");

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


//Creating a json parser object
//    JsonParser jsonparser= new JsonParser();
//parsing the content of the json file
//   String dataFilePath= "C://Users//SherifA4//IdeaProjects//AppiumDemo-master//AppiumDemo-master//src//test//resources//TestDataFiles//TestData.json";
//   FileReader reader = new FileReader(dataFilePath);
//   JsonObject jsonobject = (JsonObject) jsonparser.parse(reader);
//  String text= String.valueOf(jsonobject.get("textField"));
//  System.out.println(text);