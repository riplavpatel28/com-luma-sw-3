package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenTest extends BaseTest {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu - tops - click on jacket
        WebElement women = driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        WebElement tops = driver.findElement(By.xpath("//a[@id='ui-id-9']"));
        WebElement jacket = driver.findElement(By.xpath("//a[@id='ui-id-11']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women).build().perform();
        actions.moveToElement(tops).build().perform();
        actions.moveToElement(jacket).click().build().perform();


        // Select Sort By filter “Product Name”

        driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")).click();


        //Verify the products name display inalphabetical order
//        String actualText = "Product Name";
//        String expectedText = driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")).getText();
//        Assert.assertEquals("Not Matched Text", expectedText, actualText);

    }

    @Test
    public void verifyTheSortByPriceFilter() {
         //Mouse Hover on Women Menu - tops - click on jacket
        WebElement women =driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
        WebElement tops =driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
        WebElement jackets=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women).build().perform();
        actions.moveToElement(tops).build().perform();
        actions.moveToElement(jackets).click().build().perform();




        // Select Sort By filter “Price”
        driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]")).click();

        // Verify the products price display inLow to High



    }


    @After
    public void tearDown() {
        //   closeBrowser();
    }
}

