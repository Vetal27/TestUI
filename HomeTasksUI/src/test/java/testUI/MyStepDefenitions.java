package testUI;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import testUI.pages.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepDefenitions {
    private static final long DEFAULT_TIMEOUT = 30;
    WebDriver driver;
    private HomePage homePage;
    private ListBoxPage listBoxPage;
    private SimpleFirstDemoPage simpleFirstDemoPage;
    public testUI.PageFactory pageFactory;

    @Before
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }

    @Given("User opens {string} page")
    public void userOpenPage(final String URL) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactory = new testUI.PageFactory(driver);
        driver.get(URL);
    }

    @When("User select 'Basic' tab")
    public void userClickOnInputForms() {
        homePage = pageFactory.getHomePage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickOnInputFormsButton();
        homePage.clickOnSimpleFormsDemoButton();
    }
    @And("User select 'Simple Form Demo'")
    public void userClickOnSimpleFormsDemo() {
        homePage.clickOnSimpleFormsDemoButton();
    }
    @And("User check that 'Enter message' input field placeholder equals to {string}")
    public void userCheckEnterMessageInput(String placeholderText){
        simpleFirstDemoPage = pageFactory.getSimpleFirstDemoPage();
        assertEquals(simpleFirstDemoPage.getEnterMessageInputText(), placeholderText);
    }
    @And ("User type {string} into 'Single Input Field'")
    public void userTypeTextIntoSingleInputField (String message){
        simpleFirstDemoPage.writeWordInSingleInputField(message);
    }
    @And ("User click 'Show Message' button")
    public void userClickOnShowMessage() {
        simpleFirstDemoPage.clickOnShowMessageButton();
    }
    @Then ("User Check 'Your Message' text equals to entered earlier {string}")
    public void userCheckYourMessageText(String messageText){
        assertTrue(simpleFirstDemoPage.getYourMessageText().contains(messageText));
    }



    @When ("User click on 'List Box' item from the 'Menu List'")
    public void userClickOnListBox() {
        homePage = pageFactory.getHomePage();
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickOnListBoxButton();
    }
    @And ("User select 'Bootstrap List Box'")
    public void userClickOnBootstrapListBox() {
        homePage.clickOnBootstrapListBoxButton();
    }
    @And("User check that search input field placeholder equals to 'search'")
    public void userCheckSearchInputText(){
        listBoxPage = pageFactory.getListBoxPage();
        assertEquals(listBoxPage.getSearchInputText(), "search");
    }
    @And ("User type {string} text into search input field")
    public void userTypeTextInSearchField (String message){
        listBoxPage.writeWordInSearchField(message);
    }
    @Then ("User check the all search suggestions contains {string} value")
    public void userCheckAllSearchSuggestionsContainsValue(String valueText){
     //   assertTrue(listBoxPage..contains(valueText));
    }


    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
