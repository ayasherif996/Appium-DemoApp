package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActivityPage {
    private WebDriver driver;
    By customTitle = new AppiumBy.ByAccessibilityId("Custom Title");

    public ActivityPage(WebDriver driver) {
        this.driver = driver;
    }

    public CustomTitlePage clickOnCustomTitleButton(){
        driver.findElement(customTitle).click();
        return new CustomTitlePage(driver);
    }


}
