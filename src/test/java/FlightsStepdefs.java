import airprojects.resvoyage.globals.Globals;
import airprojects.resvoyage.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightsStepdefs {
    LandingPage landingPage = new LandingPage();
    FlightSelectPage flightSelectPage = new FlightSelectPage();
    ConfirmFlightPage confirmFlightPage = new ConfirmFlightPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    CarSelectPage carSelectPage = new CarSelectPage();
    HotelSearchPage hotelSearchPage = new HotelSearchPage();
    HotelSelectPage hotelSelectPage = new HotelSelectPage();
    HotelBookNowConfirmPage hotelBookNowConfirmPage = new HotelBookNowConfirmPage();


    @Given("Flight selection homepage")
    public void seeIfThisWork(){landingPage.getUrl(Globals.baseUrl);}

    @When("User clicks on one way button")
    public void userClickOnOneWayButton() {landingPage.clickOnOneWay();
    }

    @And("User selects departure {string}")
    public void userSelectsDepartureAndDaysFromTodayAndMonthFromThisMonth(String arg0) {
        landingPage.selectDepartureCity(arg0);
    }

    @And("User selects destination {string}")
    public void userSelectsDestination(String arg0) {landingPage.selectDestinationCity(arg0);
    }

    @And("User selects {int} adults")
    public void userSelectsAdults(int arg0) {landingPage.selectNumberOfAdults(arg0);
    }

    @And("User selects cabin preference {int}")
    public void userSelectsCabinPreference(int arg0) {landingPage.selectCabinPreference(arg0);
    }

    @And("User starts searching for flights by clicking submit button")
    public void userClickSubmitButton() {landingPage.startSearchingClickSubmitBtn();
    }

    @And("User selects flight {int}-st on the list")
    public void userSelectsFlight(int arg0) {flightSelectPage.selectFlight(arg0-1);
    }

    @And("User selects compartment {int}")
    public void userSelectsCompartment(int arg0) {flightSelectPage.selectCompartmentForTheSelectedFlight(arg0);
    }

    @And("User fills in passenger data for one way")
    public void userFillInUserData() {
        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
    }

    @And("User selects seat with code {string}")
    public void userSelectsSeatWithCode(String arg0) {
        confirmFlightPage.selectSeats(arg0);
    }

    @And("User clicks on confirm button")
    public void userClickOnConfirmButton() {
        confirmFlightPage.clickConfirmButton();
    }

    @Then("Confirm booking number is displayed and get booking number")
    public void confirmBookingNumberIsDisplayedAndGetBookingNumber() {
        checkoutPage.getBookingNumber();
    }

    @And("Departure date {int}-th day on {int}-th month from this month")
    public void departureDateThDayOnThMonthFromThisMonth(int arg0, int arg1) {
        landingPage.selectDepartureDateNMonth(arg0,arg1);
    }

    @When("User clicks on round-trip button")
    public void userClicksOnRoundTripButton() {landingPage.clickRoundTrip();
    }

    @And("Departure date {int} days from today")
    public void departureDateDaysFromToday(int arg0) {
        landingPage.selectDepartureDateThisMonth(arg0);
    }

    @And("Return date {int}-th day on {int}-th month from this month")
    public void returnDateThDayOnThMonthFromThisMonth(int arg0, int arg1) {
        landingPage.selectReturnDateNMonth(arg0,arg1);
    }

    @And("User selects {int} children")
    public void userSelectsChildren(int arg0) {
        landingPage.selectNumberOfChildren(arg0);
    }

    @And("User selects credit card payment option")
    public void userSelectsCreditCardPaymentOption() {
        confirmFlightPage.selectCreditCardPaymentOption();
    }

    @And("User clicks on add car button")
    public void userClicksOnAddCarButton() {
        confirmFlightPage.clickAddCarButton();
    }

    @And("User fills in pickup hour {string} and drop-off hour {string}")
    public void userFillsInPickupHourAndDropOffHour(String arg0, String arg1) {
        carSelectPage.changePickUpH(arg0);
        carSelectPage.changeDropOffH(arg1);
    }

    @And("User clicks on submit search button in car page")
    public void userClicksOnSubmitSearchButtonInCarPage() {
        carSelectPage.clickSubmitBtnCarPage();
    }

    @And("User selects {int}-st card on the list")
    public void userSelectsStCardOnTheList(int arg0) {
        carSelectPage.selectCar(arg0-1);
    }

    @And("User fills in passenger data round trip")
    public void userFillsInPassengerDataRoundTrip() {
        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
        confirmFlightPage.fillInfantPasseData();
    }

    @And("User fills in credit card data")
    public void userFillsInCreditCardData() {
        confirmFlightPage.fillCreditCardInfo();
    }

    @And("Check names in passenger list match the filled in names")
    public void checkNamesInPassengerListMatchTheFilledInNames() {
        checkoutPage.asserNamesAreCorrect();
    }

    @And("User selects {int} infants")
    public void userSelectsInfants(int arg0) {
        landingPage.selectNumberOfInfants(arg0);
    }

    @And("User selects preferred airline {string}")
    public void userSelectsPreferredAirline(String arg0) {landingPage.addPreferredAirline(arg0);
    }

    @When("User clicks on multi destination button")
    public void userClicksOnMultiDestinationButton() {landingPage.clickMultiDestination();
    }

    @And("User selects first departure city {string} and first destination {string}")
    public void userSelectsFirstDepartureCityAndFirstDestination(String arg0, String arg1) {
        landingPage.selectFirstDepartureCity(arg0);
        landingPage.selectFirstDestinationCity(arg1);
    }

    @And("User selects first flight {int} day and {int} months from this month")
    public void userSelectsFirstFlightDayAndMonthsFromThisMonth(int arg0, int arg1) {
        landingPage.selectFirstFlightDate(arg0,arg1);
    }

    @And("User clicks on add a second flight")
    public void userClicksOnAddASecondFlight() {landingPage.addSecondFlight();
    }

    @And("User selects second departure city {string} and second destination city {string}")
    public void userSelectsSecondDepartureCityAndSecondDestinationCity(String arg0, String arg1) {
        landingPage.selectSecondDepartureCity(arg0);
        landingPage.selectSecondDestinationCity(arg1);
    }

    @And("User selects second flight {int} days, {int} months after first flight")
    public void userSelectsSecondFlightDaysMonthsAfterFirstFlight(int arg0, int arg1) {
        landingPage.selectSecondFlightDate(arg0,arg1);
    }

    @And("User clicks on add a third flight")
    public void userClicksOnAddAThirdFlight() {landingPage.addThirdFlight();
    }

    @And("User selects third flight departure city {string} and third destination city {string}")
    public void userSelectsThirdFlightDepartureCityAndThirdDestinationCity(String arg0, String arg1) {
        landingPage.selectThirdDepartureCity(arg0);
        landingPage.selectThirdDestinationCity(arg1);
    }

    @And("User selects third flight {int} days, {int} months after second flight")
    public void userSelectsThirdFlightDaysMonthsAfterSecondFlight(int arg0, int arg1) {
        landingPage.selectThirdFlightDate(arg0,arg1);
    }

    @And("User click on advanced options")
    public void userClickOnAdvancedOptions() {landingPage.clickAdvancedOptions();
    }

    @And("User selects flight type {string}")
    public void userSelectsFlightType(String  one_OR_zero) {landingPage.selectFlightType(one_OR_zero);
    }

    @And("User start searching for flights")
    public void userStartSearchingForFlights() {
        landingPage.startSearchingClickSubmitBtn();
    }

    @And("User selects flight with preferred airline {string}")
    public void userSelectsFlightWithPreferredAirline(String arg0) {
        flightSelectPage.selectFlightWithPreferredAirline(arg0);
    }

    @And("User selects compartment {int} for multi destination flights")
    public void userSelectsCompartmentForMultiDestinationFlights(int arg0) {
        flightSelectPage.selectCompartmentForMultiFlightT(arg0);
    }

    @And("User clicks on add hotel button")
    public void userClicksOnAddHotelButton() {confirmFlightPage.clickAddHotelButton();
    }

    @And("User selects hotel location {string} and checkout date {int} days from arrival")
    public void userSelectsHotelLocationAndCheckoutDateDaysFromArrival(String arg0, int arg1) {
        hotelSearchPage.selectHotelLocation(arg0);
        hotelSearchPage.selectDateOfCheckOut(arg1);
    }

    @And("User selects number of rooms {int}")
    public void userSelectsNumberOfRooms(int arg0) {hotelSearchPage.selectNumberOfRooms(arg0);
    }

    @And("For selected room1 select {int} adults and {int} children, Room2 {int} adults and {int} children")
    public void forSelectedRoomSelectAdultsAndChildrenRoomAdultsAndChildren(int arg0, int arg1, int arg2, int arg3) {
        hotelSearchPage.selectNumberOfPersonsRoom1(arg0,arg1);
        hotelSearchPage.selectNumberOfPersonsRoom2(arg2,arg3);
    }

    @And("Change select of children in Room2  {int} and {int}")
    public void changeSelectOfChildrenInRoomAnd(int arg0, int arg1) {
        hotelSearchPage.childAgeRoom2(arg0,arg1);
    }

    @And("User clicks on search for hotel button")
    public void userClicksOnSearchForHotelButton() {
        hotelSearchPage.clickSearchButton();
    }

    @And("User selects hotels with max price {double}-$ per night")
    public void userSelectsHotelsWithMaxPrice$PerNight(double arg0) {
        hotelSelectPage.switchToSortByPrice_HIGH_LOW();
        hotelSelectPage.selectHotelWithMaxPrice(arg0);
    }

    @And("User selects hotel full package with max price {double} -$ total")
    public void userSelectsHotelFullPackageWithMaxPrice$(double arg0) {
        hotelBookNowConfirmPage.selectHotelWithMaxPrice(arg0);
    }

    @And("User fills in passenger data for multi flight")
    public void userFillsInPassengerDataForMultiFlight() {
        confirmFlightPage.fillFirstPassengerData();
        confirmFlightPage.fillSecondPassengerData();
        confirmFlightPage.fillThirdPassengerData();
        confirmFlightPage.fillFirstChildData();
        confirmFlightPage.fillSecondChildData();
    }
}
