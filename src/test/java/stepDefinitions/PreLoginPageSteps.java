package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class PreLoginPageSteps {

    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@pre-login", order = 0)
    public void launchApplication() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After
    public void closeApplication() {
        BaseSteps.closeDriver();
    }


    @When("the user clicks on BAHASA MALAYSIA in the Prelogin Page")
    public void the_user_clicks_on_bahasa_malaysia_in_the_prelogin_page() {
    pm.preLoginPage().changeLanguageToMalay();
    }
    @Then("the user clicks on CHINESE in the Prelogin Page")
    public void the_user_clicks_on_chinese_in_the_prelogin_page() {
       pm.preLoginPage().changeLanguageToChina();
    }
    @Then("the user clicks on ENGLISH in the Prelogin Page")
    public void the_user_clicks_on_english_in_the_prelogin_page() {
    pm.preLoginPage().changeLanguageToEng();
    }
    @When("verifies that the app language changes in malasia language")
    public void verifies_that_the_app_language_changes_in_malasia_language() {
        //pm.preLoginPage().changeLanguageToMalay();
        pm.preLoginPage().verifyLangChangeToMalasia();
    }
    @Then("verifies that the app language changes in chinese language")
    public void verifies_that_the_app_language_changes_in_chinese_language() {
     // pm.preLoginPage().changeLanguageToChina();
      pm.preLoginPage().verifyLangChangeToChina();
    }
    @Then("verifies that the app language changes in english language")
    public void verifies_that_the_app_language_changes_in_english_language() {
        pm.preLoginPage().changeLanguageToEng();
        pm.preLoginPage().verifyLangChangeToEnglish();
    }

    @When("the user clicks on select terminal dropdown and choose KCH-Kutching in the Prelogin Page")
    public void the_user_clicks_on_select_terminal_dropdown_and_choose_kch_kutching_in_the_prelogin_page() {
        pm.preLoginPage().changeTerminalToKCH();
    }
    @Then("the user clicks on Submit button on the Prelogin Page")
    public void the_user_clicks_on_submit_button_on_the_prelogin_page() {
        pm.preLoginPage().submit();
    }
}
