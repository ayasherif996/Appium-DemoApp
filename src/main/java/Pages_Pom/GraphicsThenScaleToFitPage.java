package Pages_Pom;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GraphicsThenScaleToFitPage {
    private WebDriver driver;
    private By GraphicsAndScaleToFit = AppiumBy.xpath("//android.widget.TextView[@text='Graphics/ScaleToFit']");

    public GraphicsThenScaleToFitPage(WebDriver driver) {
        this.driver = driver;
    }

    public GraphicsThenScaleToFitPage assertOnGraphicsScaleToFit(String expected) {
        Assert.assertEquals(driver.findElement(GraphicsAndScaleToFit).getText(), expected);
        return this;
    }
}
