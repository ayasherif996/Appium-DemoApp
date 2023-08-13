package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppPage {
    private WebDriver driver;

    By ActivityButton = new AppiumBy.ByAccessibilityId("Activity");

    public AppPage(WebDriver driver) {
        this.driver = driver;
    }

    public  ActivityPage clickOnActivityButton(){
        driver.findElement(ActivityButton).click();
        return new ActivityPage(driver);
    }


}
