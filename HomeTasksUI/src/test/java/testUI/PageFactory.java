package testUI;

import org.openqa.selenium.WebDriver;
import testUI.pages.*;


public class PageFactory {
    WebDriver driver;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomePage()    { return new HomePage(driver); }
    public ListBoxPage getListBoxPage()    { return new ListBoxPage(driver); }
    public SimpleFirstDemoPage getSimpleFirstDemoPage() {
        return new SimpleFirstDemoPage(driver);
    }

}
