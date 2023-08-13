package Pages_Pom;

import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By accessibilityButton = new AppiumBy.ByAccessibilityId("Access'ibility");
    By graphicsButton = new AppiumBy.ByAccessibilityId("Graphics");

    By viewsButton = new AppiumBy.ByAccessibilityId("Views");

    By appButton = new AppiumBy.ByAccessibilityId("App");


    public FirstAccessibilityPage clickOnAccessibilityButton(){
        driver.findElement(accessibilityButton).click();
        return new FirstAccessibilityPage(driver);
    }

    public GraphicsPage clickOnGraphicsButton(){
        driver.findElement(graphicsButton).click();
        return new GraphicsPage(driver);
    }

    public ViewPage ClickOnviewsButton(){
        driver.findElement(viewsButton).click();
        return new ViewPage(driver);
    }

    public AppPage clickOnAppButton(){
        driver.findElement(appButton).click();
        return new AppPage(driver);
    }





}
