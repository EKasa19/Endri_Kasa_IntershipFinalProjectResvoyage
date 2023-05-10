package airprojects.resvoyage.pages;

import airprojects.resvoyage.elements.LandingPageElements;
import airprojects.resvoyage.utilities.BaseInformation;
import airprojects.resvoyage.utilities.BasePageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import static airprojects.resvoyage.utilities.WaitUtils.waitFor;

public class LandingPage {
    BasePageObject basePageObject = new BasePageObject(BaseInformation.getBaseInformation());
    LandingPageElements landingPageElements = new LandingPageElements();
    public LandingPage(){PageFactory.initElements(BaseInformation.getDriver(), this);}
    public void getUrl(String url){
        BaseInformation.getDriver().get(url);
    }

    public void clickRoundTrip(){
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.roundTripSelect).click();
        System.out.println("User clicks on Round Trip button.");
    }
    public void clickOnOneWay(){
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.oneWaySelect).click();
        System.out.println("User clicks on One Way button.");
    }
    public void clickMultiDestination(){
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.multiDestinationSelect).click();
        System.out.println("User clicks on Multi Destination button.");
    }
    public void selectDepartureCity(String city){
        System.out.println("User types "+city+" in the departure city search box.");
        landingPageElements.selectDepartureCity.click();
        landingPageElements.selectDepartureCity.sendKeys(city);
        waitFor(2000);
        landingPageElements.selectDepartureCity.sendKeys(Keys.ENTER);
    }
    public void selectDestinationCity(String city){
        System.out.println("User types "+city+" in the destination city search box.");
        landingPageElements.selectDestinationCity.click();
        landingPageElements.selectDestinationCity.sendKeys(city);
        waitFor(2000);
        landingPageElements.selectDestinationCity.sendKeys(Keys.ENTER);
    }
    public void selectCabinPreference(int prefCase){
        // 1-economy 2-business 3-first 4-Economy 0-default
        Select selectCabin = new Select(landingPageElements.selectCabinPreference);
        String cabin;
        cabin = String.valueOf(prefCase);
        selectCabin.selectByValue(cabin);
        System.out.println("User selects "+landingPageElements.selectCabinPreference.getText()+" cabin type they want" );
    }
    public void selectNumberOfAdults(int  num){
        System.out.println("User selects "+num+" adults");
        dropdownSelectNumberPassengers(landingPageElements.adultCount, num);
    }
    public void selectNumberOfChildren(int num){
        System.out.println("User selects "+num+" children");
        dropdownSelectNumberPassengers(landingPageElements.childCount, num);
    }
    public void selectNumberOfInfants(int num){
        System.out.println("User selects "+num+" infants");
        dropdownSelectNumberPassengers(landingPageElements.infantCount, num);
    }
    void dropdownSelectNumberPassengers(WebElement passengerCategoryA_C_I, int  num){
        basePageObject.getWaitUtils().waitForElementVisible(passengerCategoryA_C_I);
        basePageObject.getWebElementUtils().scrollToElement(passengerCategoryA_C_I);
        passengerCategoryA_C_I.click();
        Select dropDown = new Select(passengerCategoryA_C_I);
        String selectOption;
        selectOption = String.valueOf(num);
        dropDown.selectByVisibleText(selectOption);
    }
    public void selectDepartureDateThisMonth(int i){
        System.out.println("User selects departure date "+i+1+" days from today");
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.selectDepartureDate).click();
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(i)).click();
    }
    public void selectDepartureDateNMonth(int dayOnSelectedMonth,int monthsFromThisMonth) {
        System.out.println("User selects the departure day in "+monthsFromThisMonth+" months from this now");
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.selectDepartureDate).click();
        for (int i = 0; i < monthsFromThisMonth; i++)
        {basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.nextMonthButton).click();}
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(dayOnSelectedMonth)).click();
    }
    public void selectReturnDate(int i){
        System.out.println("User selects departure day"+i+1+" days from today");
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.selectReturnDate).click();
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(i)).click();
    }
    public void selectReturnDateNMonth(int dayOnSelectedMonth,int monthsFromThisMonth){
        System.out.println("User selects the return day in "+monthsFromThisMonth+" months from this now");
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.selectReturnDate).click();
        for (int i = 0; i < monthsFromThisMonth; i++)
        {basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.nextMonthButton).click();}
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(dayOnSelectedMonth)).click();
    }
    public void startSearchingClickSubmitBtn(){
        System.out.println("User start the search for flights");
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.submitBTN).click();
    }

    //First Flight multi flight
    public void selectFirstDepartureCity(String city){
        System.out.println("User selects first departure city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.firstDepartureCityMultiFlight);
        landingPageElements.firstDepartureCityMultiFlight.click();
        landingPageElements.firstDepartureCityMultiFlight.sendKeys(city);
        waitFor(2000);
        landingPageElements.firstDepartureCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectFirstDestinationCity(String city){
        System.out.println("User selects first destination city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.firstDestinationCityMultiFlight);
        landingPageElements.firstDestinationCityMultiFlight.click();
        landingPageElements.firstDestinationCityMultiFlight.sendKeys(city);
        waitFor(2000);
        landingPageElements.firstDestinationCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectFirstFlightDate(int dayOnSelectedMonth,int monthsFromThisMonth){
        System.out.println("User selects date and month of the flight");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.firstDepartureDateMultiFlight).click();
        for (int i = 0; i < monthsFromThisMonth; i++)
        {basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.nextMonthButton).click();}
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(dayOnSelectedMonth)).click();
    }


    //Second flight multi flight
    public void addSecondFlight(){
        System.out.println("User click on add flight button");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.addSecondFlightPlusButton).click();
    }
    public void selectSecondDepartureCity(String city){
        System.out.println("User selects second departure city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.secondDepartureCityMultiFlight);
        landingPageElements.secondDepartureCityMultiFlight.click();
        landingPageElements.secondDepartureCityMultiFlight.sendKeys(city);
        waitFor(3000);
        landingPageElements.secondDepartureCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectSecondDestinationCity(String city){
        System.out.println("User selects second destination city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.secondDestinationCityMultiFlight);
        landingPageElements.secondDestinationCityMultiFlight.click();
        landingPageElements.secondDestinationCityMultiFlight.sendKeys(city);
        waitFor(2000);
        landingPageElements.secondDestinationCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectSecondFlightDate(int dayOnSelectedMonth,int monthsFromThisMonth){
        System.out.println("User selects date and month of the flight");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.secondDepartureDateMultiFlight).click();
        for (int i = 0; i < monthsFromThisMonth; i++)
        {basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.nextMonthButton).click();}
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(dayOnSelectedMonth)).click();
    }


    //Third flight multi flight
    public void addThirdFlight(){
        System.out.println("User click on add flight button");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.addThirdFlightPlusButton).click();
    }
    public void selectThirdDepartureCity(String city){
        System.out.println("User selects third departure city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.thirdDepartureCityMultiFlight);
        landingPageElements.thirdDepartureCityMultiFlight.click();
        landingPageElements.thirdDepartureCityMultiFlight.sendKeys(city);
        waitFor(3000);
        landingPageElements.thirdDepartureCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectThirdDestinationCity(String city){
        System.out.println("User selects third destination city");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.thirdDestinationCityMultiFlight);
        landingPageElements.thirdDestinationCityMultiFlight.click();
        landingPageElements.thirdDestinationCityMultiFlight.sendKeys(city);
        waitFor(2000);
        landingPageElements.thirdDestinationCityMultiFlight.sendKeys(Keys.ENTER);
    }
    public void selectThirdFlightDate(int dayOnSelectedMonth,int monthsFromThisMonth){
        System.out.println("User selects date and month");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.thirdDepartureDateMultiFlight).click();
        for (int i = 0; i < monthsFromThisMonth; i++)
        {basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.nextMonthButton).click();}
        basePageObject.getWaitUtils().waitForElementClickable(landingPageElements.listOfAllAvailableDates.get(dayOnSelectedMonth)).click();
    }

    public void clickAdvancedOptions(){
        System.out.println("User click on advanced options");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.advancedOptionsDropdownIcon);
        basePageObject.getWebElementUtils().scrollToElement(landingPageElements.advancedOptionsDropdownIcon);
        landingPageElements.advancedOptionsDropdownIcon.click();
    }
    public void selectFlightType(String oneOrZero){
        System.out.println("User selects flight type");
        basePageObject.getWebElementUtils().scrollToElement(landingPageElements.dropDownSelectFlightType);
        Select dropdown = new Select(landingPageElements.dropDownSelectFlightType);
        dropdown.selectByValue(oneOrZero);
    }
    public void addPreferredAirline(String airlineName){
        System.out.println("User adds preferred airline in advanced options section");
        basePageObject.getWaitUtils().waitForElementVisible(landingPageElements.prefAirlineInput);
        landingPageElements.prefAirlineInput.click();
        landingPageElements.prefAirlineInput.sendKeys(airlineName);
        waitFor(2000);
        landingPageElements.prefAirlineInput.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
    }
}
