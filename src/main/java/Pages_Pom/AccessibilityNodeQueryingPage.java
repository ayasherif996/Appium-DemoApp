package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccessibilityNodeQueryingPage {
    private WebDriver driver;
        /*
       another xpath to locate checkbox
       //android.widget.TextView[@content-desc="Task Conquer World"]/parent::android.widget.LinearLayout/android.widget.CheckBox
            */
    By checkBox = new By.ByXPath("(//*[@resource-id='io.appium.android.apis:id/tasklist_finished'])[3]");

    public AccessibilityNodeQueryingPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccessibilityNodeQueryingPage  clickOnCheckBox(){
        driver.findElement(checkBox).click();
        return this;
    }



}
