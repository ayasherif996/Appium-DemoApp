package Pages_Pom;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewPage {

    private WebDriver driver;

    By radioGroupElement = new AppiumBy.ByAccessibilityId("Radio Group");

    public ViewPage(WebDriver driver) {
        this.driver = driver;
    }

    public ViewPage scrollToRadioGroupElement(){
        MobileActions action = new MobileActions(driver);
        action.scrollDownToSpecificText("Radio Group");
        return this;
    }

    public ViewThenRadioGroupPage clickOnRadioGroupElement(){
        driver.findElement(radioGroupElement).click();
        return  new ViewThenRadioGroupPage(driver);
    }


}
