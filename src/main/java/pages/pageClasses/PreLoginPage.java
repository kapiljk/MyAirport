package pages.pageClasses;

import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import pages.pageLocators.PreLoginPageLoc;
import utils.MobileUtils;

public class PreLoginPage extends MobileUtils implements PreLoginPageLoc {

    private AndroidDriver _driver;

    public PreLoginPage(AndroidDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void changeLanguageToEng() {
        click(ddChinaLang, "Language Dropdown");
        click(ddLanguage, "Selecting English");
    }
    public void changeLanguageToMalay() {
        click(ddLanguage, "Language Dropdown");
        click(ddMalayLang, "Selecting Malayasia");
    }
    public void changeLanguageToChina() {
        click(ddMalayLang, "Language Dropdown");
        click(ddChinaLang, "Selecting China");
    }
    public void changeTerminalToKCH(){
        click(ddSelAirport,"Termainal Dropdown");
        click(ddSelAirKCH,"KCH Terminal");
    }
    public void verifyLangChangeToEnglish(){
        String text = _driver.findElement(btnSubmit).getText();
        Assert.assertTrue(text.contains("SUBMIT"),"Submit button in English Language");
    }

    public void verifyLangChangeToMalasia(){

        String text = _driver.findElement(btnSubmitMalayLang).getText();
        Assert.assertTrue(text.contains("HANTAR"),"Submit button in Malasia Language");

    }

    public void verifyLangChangeToChina(){
        String text = _driver.findElement(btnSubmitChinaLang).getText();
        Assert.assertTrue(text.contains("提交"),"Submit button in Chines Language");
    }

    public void submit(){
        click(btnSubmit, "Submit button");
    }
}
