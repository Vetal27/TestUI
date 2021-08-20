package testUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SimpleFirstDemoPage extends BasePage {

    private static final By ENTER_MESSAGE_INPUT = By.xpath("//input[@id='user-message']");
    private static final By SHOW_MESSAGE_BUTTON = By.xpath("//button[contains(text(), 'Show Message')]");
    private static final By YOUR_MESSAGE = By.xpath("//span[@id='display']");

    public SimpleFirstDemoPage(WebDriver driver) {
        super(driver);
    }


    public String getEnterMessageInputText() {
        return driver.findElement(ENTER_MESSAGE_INPUT).getAttribute("placeholder");
    }
    public void writeWordInSingleInputField(final String message){
        driver.findElement(ENTER_MESSAGE_INPUT).sendKeys(message);
    }
    public void clickOnShowMessageButton(){
        driver.findElement(SHOW_MESSAGE_BUTTON).click();
    }
    public String getYourMessageText() {
        return driver.findElement(YOUR_MESSAGE).getText();
    }
}