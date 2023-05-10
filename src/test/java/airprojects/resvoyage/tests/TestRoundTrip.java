package airprojects.resvoyage.tests;

import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.pages.*;
import airprojects.resvoyage.utilities.BaseInformation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestRoundTrip {
    LandingPage landingPage = new LandingPage();
    FlightSelectPage flightSelectPage = new FlightSelectPage();
    ConfirmFlightPage confirmFlightPage = new ConfirmFlightPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CarSelectPage carSelectPage = new CarSelectPage();

    @AfterTest
    public void quit(){
        BaseInformation.quit();
    }
    @Test
    public void roundTripTest(){
        landingPage.getUrl(Globals.baseUrl);
        landingPage.clickRoundTrip();
        landingPage.selectDepartureCity("barcelona");
        landingPage.selectDestinationCity("milan");
        landingPage.selectDepartureDateThisMonth(6);
        landingPage.selectReturnDateNMonth(0,1);
        landingPage.selectNumberOfAdults(2);
        landingPage.selectNumberOfInfants(1);
        landingPage.selectCabinPreference(2);
        landingPage.startSearchingClickSubmitBtn();

        flightSelectPage.selectFlight(0);
        flightSelectPage.selectCompartmentForTheSelectedFlight(0);

        confirmFlightPage.selectCreditCardPaymentOption();
        confirmFlightPage.clickAddCarButton();

        carSelectPage.changePickUpH("08:00 am");
        carSelectPage.changeDropOffH("08:00 am");
        carSelectPage.clickSubmitBtnCarPage();
        carSelectPage.selectCar(0);

        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
        confirmFlightPage.fillInfantPasseData();
        confirmFlightPage.fillCreditCardInfo();
        confirmFlightPage.clickConfirmButton();

        checkoutPage.getBookingNumber();
        checkoutPage.asserNamesAreCorrect();
    }
}
