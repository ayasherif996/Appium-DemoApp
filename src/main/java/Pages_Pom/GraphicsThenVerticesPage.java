package Pages_Pom;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsThenVerticesPage {

    By photo = new By.ByXPath("(//android.view.View)[1]");

    MobileActions action;
    private  WebDriver driver;

    public GraphicsThenVerticesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void swipePhotoRight(){
      action=  new MobileActions(driver);
        action.swipeRightOnElement(photo,driver);
    }

    public void swipePhotoLeft(){
      action=   new MobileActions(driver);
        action.swipeLeftOnElement(photo);
    }
}
