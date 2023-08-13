package Pages_Pom;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphicsPage {

    private WebDriver driver;

    By  scaleToFitButton= new AppiumBy.ByAccessibilityId("ScaleToFit");
    By  VerticesButton = new  AppiumBy.ByAccessibilityId("Vertices");

    public GraphicsPage(WebDriver driver) {

        this.driver = driver;
    }

public  GraphicsPage scrollToScaleToFitElement(){
    MobileActions action =  new MobileActions(driver);
    action.scrollDownToSpecificText("ScaleToFit");
     return  new GraphicsPage(driver);
}
    public  GraphicsThenScaleToFitPage clickOnScaleToFitButton(){
        driver.findElement(scaleToFitButton).click();
        return  new GraphicsThenScaleToFitPage(driver);
    }

    public GraphicsPage scrollToVertices(){
        MobileActions action=  new MobileActions(driver);
        action.scrollDownToSpecificText("Vertices");
        return new GraphicsPage(driver);
    }

    public  GraphicsThenVerticesPage clickOnVerticesButton(){
        driver.findElement(VerticesButton).click();
        return new GraphicsThenVerticesPage(driver);
    }


}
