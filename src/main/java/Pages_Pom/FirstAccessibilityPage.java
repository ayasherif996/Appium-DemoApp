package Pages_Pom;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FirstAccessibilityPage {

    //fluent design
    private WebDriver driver;

    private  By accessibilityNodeProvider = AppiumBy.accessibilityId("Accessibility Node Provider");
   private By accessibilityNodeQuerying = new AppiumBy.ByAccessibilityId("Accessibility Node Querying");

    public FirstAccessibilityPage(WebDriver driver) {
        this.driver = driver;
    }


    public AccessibilityNodeQueryingPage clickOnaccessibilityNodeQueryingButton(){
        driver.findElement(accessibilityNodeQuerying).click();
          return new AccessibilityNodeQueryingPage(driver);
    }

    public FirstAccessibilityPage assertOnAccessibilityNodeProviderText(String expected) {
        Assert.assertEquals(driver.findElement(accessibilityNodeProvider).getText(), expected);
        return this;
    }

//    public HomePage validateAccessibilityNodeProviderText(){
////        driver.assertThat().element(accessibilityNodeProvider_button).text().equals("Accessibility Node Provider");
//        assert.assertEquals(driver.element().getText(accessibilityNodeProvider_button)).equals(testData.getTestData("Accessibility"));
//        return  this;
//    }



}
