package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomTitlePage {
    private WebDriver driver;
    By TextField1 = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
    By changeLeftButton = AppiumBy.accessibilityId("Change Left");


    public CustomTitlePage(WebDriver driver) {
        this.driver = driver;
    }

public CustomTitlePage clearTextField1(){
        driver.findElement(TextField1).clear();
        return this;
}

public CustomTitlePage enterTextInTextField(String text){
        driver.findElement(TextField1).sendKeys(text);
        return this;
}


public CustomTitlePage clickOnChangeLeftButton(){
        driver.findElement(changeLeftButton).click();
        return this;
}


}
