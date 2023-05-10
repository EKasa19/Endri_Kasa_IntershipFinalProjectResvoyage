package airprojects.resvoyage.tests;

import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.pages.*;
import airprojects.resvoyage.utilities.BaseInformation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestMultipleFlight {
    LandingPage landingPage = new LandingPage();//done
    FlightSelectPage flightSelectPage = new FlightSelectPage();
    ConfirmFlightPage confirmFlightPage = new ConfirmFlightPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    HotelSearchPage hotelSearchPage = new HotelSearchPage();
    HotelSelectPage hotelSelectPage = new HotelSelectPage();
    HotelBookNowConfirmPage hotelBookNowConfirmPage = new HotelBookNowConfirmPage();

    @AfterTest
    public void quit(){
        BaseInformation.quit();
    }
    @Test
    public void multipleFlights(){
        landingPage.getUrl(Globals.baseUrl);
        landingPage.clickMultiDestination();

        //First flight info
        landingPage.selectFirstDepartureCity("new york");
        landingPage.selectFirstDestinationCity("miami");
        landingPage.selectFirstFlightDate(5,0);

        //Second Flight info
        landingPage.addSecondFlight();
        landingPage.selectSecondDepartureCity("miami");
        landingPage.selectSecondDestinationCity("San Francisco");
        landingPage.selectSecondFlightDate(0,0);

        //Third flight info
        landingPage.addThirdFlight();
        landingPage.selectThirdDepartureCity("San Francisco");
        landingPage.selectThirdDestinationCity("miami");
        landingPage.selectThirdFlightDate(7,0);


        landingPage.selectCabinPreference(1);
        landingPage.selectNumberOfAdults(3);
        landingPage.selectNumberOfChildren(2);

        landingPage.clickAdvancedOptions();
        landingPage.selectFlightType("1");
        landingPage.addPreferredAirline("");
        landingPage.startSearchingClickSubmitBtn();

        flightSelectPage.selectFlightWithPreferredAirline("");
        flightSelectPage.selectCompartmentForMultiFlightT(0);

        confirmFlightPage.selectCreditCardPaymentOption();
        confirmFlightPage.clickAddHotelButton();

        hotelSearchPage.selectHotelLocation("San Francisco");
        hotelSearchPage.selectDateOfCheckOut(7);
        hotelSearchPage.selectNumberOfRooms(2);
        hotelSearchPage.selectNumberOfPersonsRoom1(2,0);
        hotelSearchPage.selectNumberOfPersonsRoom2(1,2);
        hotelSearchPage.childAgeRoom2(Globals.child1Age,Globals.child2Age);
        hotelSearchPage.clickSearchButton();

        hotelSelectPage.switchToSortByPrice_HIGH_LOW();
        hotelSelectPage.selectHotelWithMaxPrice(3500);

        hotelBookNowConfirmPage.selectHotelWithMaxPrice(25000);

        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
        confirmFlightPage.fillThirdPassengerData();
        confirmFlightPage.fillFirstChildData();
        confirmFlightPage.fillSecondChildData();
        confirmFlightPage.fillCreditCardInfo();
        confirmFlightPage.clickConfirmButton();

        checkoutPage.getBookingNumber();
        checkoutPage.asserNamesAreCorrect();
    }
}
