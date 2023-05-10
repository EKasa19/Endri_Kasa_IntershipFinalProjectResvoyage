package airprojects.resvoyage.tests;


import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.pages.CheckoutPage;
import airprojects.resvoyage.pages.ConfirmFlightPage;
import airprojects.resvoyage.pages.FlightSelectPage;
import airprojects.resvoyage.pages.LandingPage;
import airprojects.resvoyage.utilities.BaseInformation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestOneWay {
    LandingPage landingPage = new LandingPage();
    FlightSelectPage flightSelectPage = new FlightSelectPage();
    ConfirmFlightPage confirmFlightPage = new ConfirmFlightPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @AfterTest
    public void quit(){
        BaseInformation.quit();
        }
    @Test
    public void testOneWayFlight(){
        landingPage.getUrl(Globals.baseUrl);
        landingPage.clickOnOneWay();
        landingPage.selectDepartureCity("");
        landingPage.selectDestinationCity("");
        landingPage.selectDepartureDateNMonth(0,1);
        landingPage.selectCabinPreference(1);
        landingPage.selectNumberOfAdults(2);
        landingPage.startSearchingClickSubmitBtn();

        flightSelectPage.selectFlight(2);
        flightSelectPage.selectCompartmentForTheSelectedFlight(0);

        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
        confirmFlightPage.selectSeats(Globals.seatSelectionCode);
        confirmFlightPage.clickConfirmButton();

        checkoutPage.getBookingNumber();
    }
}
