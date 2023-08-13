package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewThenRadioGroupPage {
    private WebDriver driver;

    By allOfThemChoice = AppiumBy.accessibilityId("All of them");
    public ViewThenRadioGroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public ViewThenRadioGroupPage clickOnallOfThemChoice(){
        driver.findElement(allOfThemChoice).click();
        return this;
    }

}
