package stepDefinitions;

import baseTestSteps.BaseSteps;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.pageClasses.*;
import pages.pagePopups.ChooseAirportPopup;
import utils.PageObjectManager;

import java.net.MalformedURLException;

public class FlightPageSteps {
    private AndroidDriver _driver;
    private PageObjectManager pm;

    @Before(value = "@flight", order = 0)
    public void init() throws MalformedURLException {
        _driver = BaseSteps.getDriver();
        pm = new PageObjectManager(_driver);
    }

    @After("@flight")
    public void closeApp() {
        BaseSteps.closeDriver();
    }

    @Before(value = "@flight", order = 1)
    public void beforeWelcomePage() {
        BaseSteps.prelogins();
    }
    @Before(value = "@flight", order = 2)
    public void login_Into_Application_And_Enable_Location_If_Required() {
        BaseSteps.loginApplication();
    }

    @Then("click on the Flights icon in the landing page")
    public void click_on_the_flights_icon_in_the_landing_page() {
        pm.homePage().clickOnFlightsIcon();
    }

    @Then("click on Arrival toggle button in the FLIGHT INFORMATION page")
    public void click_on_arrival_toggle_button_in_the_flight_information_page() {
        pm.flightsInformationPage().verifyFlightsInformationPage();
        pm.flightsInformationPage().clickOnArrivalToggle();
    }

    @And("click on Departure toggle button in the FLIGHT INFORMATION page")
    public void click_on_departure_toggle_button_in_the_flight_information_page() throws InterruptedException {
        pm.flightsInformationPage().clickOnDepartureToggle();
    }

    @Then("change the terminal by clicking on dropdown button")
    public void change_the_terminal_by_clicking_on_dropdown_button() {
        pm.flightsInformationPage().clickOnDropDownChooseAirport();
        pm.chooseAirportPopup().verifyChooseAirportPopup();
        pm.chooseAirportPopup().selectAirportByText("KLIA Terminal 2");
    }

    @And("select any flight from available flights for Departure")
    public void select_any_flight_from_available_flights_for_departure() {
        pm.flightsInformationPage().selectFlightFromDeparture();
    }

    @Then("click back arrow in Departure page")
    public void click_back_arrow_in_departure_page() {
        pm.departurePage().verifyDeparturePage();
        pm.departurePage().clickOnBackButton();
    }

    @Then("select any flight from available flights for Arrival")
    public void select_any_flight_from_available_flights_for_arrival() {
        pm.flightsInformationPage().selectFlightFromArrival();
    }

    @And("verify the Note message in Arrival page")
    public void verify_the_note_message_in_arrival_page() {
        pm.arrivalPage().verifyArrivalPage();
        pm.arrivalPage().verifyNote();
    }

    @Then("click back arrow in Arrival page")
    public void click_back_arrow_in_arrival_page() {
        pm.arrivalPage().clickOnBackButton();
    }

    @Then("click on the Get previous Flights link User can see accordingly")
    public void click_on_the_get_previous_flights_link_user_can_see_accordingly() {
        pm.flightsInformationPage().clickOnGetPreviousFlights();
    }

    @And("click on back arrow in FLIGHT INFORMATION page")
    public void click_on_back_arrow_in_flight_information_page() {
        pm.flightsInformationPage().clickOnBackButton();
    }

    @Then("close the mobile app")
    public void close_the_mobile_app() {
        pm.homePage().verifyHomePage();
    }
}
