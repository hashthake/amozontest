package utilitytest;

import basetest.BaseTest;
import org.openqa.selenium.By;

public class UtilityTest extends BaseTest {
    /**
     * athis method for click on element
     * @param by
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    /**
     * This method to send text to element
     * @param by
     * @param text
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
}
