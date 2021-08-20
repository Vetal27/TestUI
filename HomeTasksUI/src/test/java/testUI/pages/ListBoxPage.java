package testUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListBoxPage  extends BasePage {

    private static final By SEARCH_FIELD = By.xpath("//input[@id='user-message']");


    public ListBoxPage(WebDriver driver) {
        super(driver);
    }


    public String getSearchInputText() {
        return driver.findElement(SEARCH_FIELD).getAttribute("placeholder");
    }
    public void writeWordInSearchField(final String message){
        driver.findElement(SEARCH_FIELD).sendKeys(message);
    }

    public String getYourMessageText() {
        return driver.findElement(SEARCH_FIELD).getText();
    }
}