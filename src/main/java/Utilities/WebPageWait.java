package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * In this class i have initialized all the implicit waits which i want to used in the whole project.
 */
public class WebPageWait {
    public static void waitAndClick(WebDriver driver, By locator){
        new WebDriverWait(driver,50).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public static void waitAndEnterValues(WebDriver driver, By locator, String values){
        new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(values);
    }
    public static String waitAndGetValue(WebDriver driver, By locator){
        return new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }
    public static void waitForElement(WebDriver driver, By locator){
        new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void clickOnBody(WebDriver driver){
        driver.findElement(By.xpath("/html/body")).click();
    }
    public static void waitForPageLoad() throws InterruptedException {
        Thread.sleep(3000);
    }
}
