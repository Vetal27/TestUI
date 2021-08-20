package testUI.pages;

import org.openqa.selenium.*;

public class HomePage extends BasePage {
    private static final By INPUT_FORMS_BUTTON = By.xpath("//a[@class][contains(text(), 'Input Forms')]");
    private static final By SIMPLE_FORMS_DEMO_BUTTON = By.xpath("//a[@href][contains(text(), 'Simple Form Demo')]");
    private static final By LIST_BOX_BUTTON = By.xpath("//a[@class][contains(text(), 'List Box')]");
    private static final By BOODSTRAP_LIST_BOX_BUTTON = By.xpath("//a[@href][contains(text(), 'Bootstrap List Box')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnInputFormsButton() {
        driver.findElement(INPUT_FORMS_BUTTON).click();
    }
    public void clickOnSimpleFormsDemoButton() {
        driver.findElement(SIMPLE_FORMS_DEMO_BUTTON).click();
    }
    public void clickOnListBoxButton(){driver.findElement(LIST_BOX_BUTTON).click();};
    public  void clickOnBootstrapListBoxButton(){driver.findElement(BOODSTRAP_LIST_BOX_BUTTON).click();};
}
