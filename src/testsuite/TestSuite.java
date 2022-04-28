package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilitytest.UtilityTest;

import java.util.ArrayList;
import java.util.List;

public class TestSuite extends UtilityTest {

    String baseUrl = " https://www.amazon.co.uk/";

    @Before
    // This will open browser
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductsAreDisplayOnPage(){
        // This will click and accept message
        clickOnElement(By.id("sp-cc-accept"));
        // Send text in search box
        sendTextToElement(By.id("twotabsearchtextbox"), "Dell Laptop");
        // Click on search
        clickOnElement(By.id("nav-search-submit-button"));
        // lick on Dell laptop option
        clickOnElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));

        // Save number of products in to list
        List<WebElement> productList = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
       int numberOfProducts = productList.size();
        System.out.println("Total number of products on page : " + numberOfProducts);
       for (WebElement element : productList){
          System.out.println("Text contains on the page : " +  element.getText());
        }
    }
    @After
    public void tearUp(){
        closeBrowser();
    }
}
