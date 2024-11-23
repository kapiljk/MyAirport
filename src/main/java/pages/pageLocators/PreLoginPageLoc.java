package pages.pageLocators;

import org.openqa.selenium.By;

public interface PreLoginPageLoc {

    By ddLanguage = By.xpath("//*[@text='English']");
    By ddMalayLang = By.xpath("//*[@text='Bahasa Malaysia']");
    By ddChinaLang = By.xpath("//*[@text='中文']");
    By ddSelAirport = By.xpath("//*[@text='KUL - Terminal 1']");
    By ddSelAir2 = By.xpath("//*[@text='KUL - Terminal 2']");
    By ddSelAirBKI = By.xpath("//*[@text='BKI - Kota Kinabalu']");
    By ddSelAirKCH = By.xpath("//*[@text='KCH - Kuching']");
    By ddSelAirPEN = By.xpath("//*[@text='PEN - Penang']");
    By btnSubmit = By.xpath("//*[@text='SUBMIT']");
    By btnSubmitMalayLang = By.xpath("//*[@text='HANTAR']");
    By btnSubmitChinaLang = By.xpath("//*[@text='提交']");



}
