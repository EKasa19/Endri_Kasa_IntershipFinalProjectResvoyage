package airprojects.resvoyage.elements;

import airprojects.resvoyage.utilities.BaseInformation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ConfirmFlightPageElements {
    public ConfirmFlightPageElements(){PageFactory.initElements(BaseInformation.getDriver(),this);}
    //First passenger WebElements:
    @FindBy(id = "fname_0")
    public WebElement firstPasName;
    @FindBy(id = "lname_0")
    public WebElement firstPasLname;
    @FindBy(id = "email_0")
    public WebElement firstPasEmail;
    @FindBy(id = "email_c_0")
    public WebElement firstPasEmailConfirm;
    @FindBy(id = "phone_0")
    public WebElement firstPasPhoneNum;
    @FindBy(className = "gender_0")
    public List<WebElement> firstPasGendersCheckboxOptions;
    @FindBy(id = "bdate_d_0")
    public WebElement firstPasBirthday;
    @FindBy(id = "bdate_m_0")
    public WebElement firstPasBirthMonth;
    @FindBy(id = "bdate_y_0")
    public WebElement firstPasBirthYear;
    //End Of First Passenger data WebElement.
    //Second Passenger WebElements:
    @FindBy(css = "#passengerData_1 i.dropdown")
    public WebElement secondPassDropdownClickToFillInfo;
    @FindBy(id = "fname_1")
    public WebElement secondPasName;
    @FindBy(id = "lname_1")
    public WebElement secondPasLname;
    @FindBy(className = "gender_1")
    public List<WebElement> secondPasGendersCheckboxOptions;
    @FindBy(id = "bdate_d_1")
    public WebElement secondPasBirthDay;
    @FindBy(id = "bdate_m_1")
    public WebElement secondPasBirthMonth;
    @FindBy(id = "bdate_y_1")
    public WebElement secondPasBirthYear;
    // Passenger 2 WebElements end
    // Passenger 3 WebElements start
    @FindBy(css = "#passengerData_2 i.dropdown")
    public WebElement thirdPassDropdownClickToFillInfo;
    @FindBy(id = "fname_2")
    public WebElement thirdPasName;
    @FindBy(id = "lname_2")
    public WebElement thirdPasLname;
    @FindBy(className = "gender_2")
    public List<WebElement> thirdPasGendersCheckboxOptions;
    @FindBy(id = "bdate_d_2")
    public WebElement thirdPasBirthDay;
    @FindBy(id = "bdate_m_2")
    public WebElement thirdPasBirthMonth;
    @FindBy(id = "bdate_y_2")
    public WebElement thirdPasBirthYear;
    //Passenger 3 WebElements end
    //Passenger 4 WebElements start
    @FindBy(css = "#passengerData_3 i.dropdown")
    public WebElement fourthPassDropdownClickToFillInfo;
    @FindBy(id = "fname_3")
    public WebElement fourthPasName;
    @FindBy(id = "lname_3")
    public WebElement fourthPasLname;
    @FindBy(className = "gender_3")
    public List<WebElement> fourthPasGendersCheckboxOptions;
    @FindBy(id = "bdate_d_3")
    public WebElement fourthPasBirthDay;
    @FindBy(id = "bdate_m_3")
    public WebElement fourthPasBirthMonth;
    @FindBy(id = "bdate_y_3")
    public WebElement fourthPasBirthYear;
    // Passenger 4 WebElements end
    // Passenger 5 WebElements start
    @FindBy(css = "#passengerData_4 i.dropdown")
    public WebElement fifthPassDropdownClickToFillInfo;
    @FindBy(id = "fname_4")
    public WebElement fifthPasName;
    @FindBy(id = "lname_4")
    public WebElement fifthPasLname;
    @FindBy(className = "gender_4")
    public List<WebElement> fifthPasGendersCheckboxOptions;
    @FindBy(id = "bdate_d_4")
    public WebElement fifthPasBirthDay;
    @FindBy(id = "bdate_m_4")
    public WebElement fifthPasBirthMonth;
    @FindBy(id = "bdate_y_4")
    public WebElement fifthPasBirthYear;
    //Passenger 5 WebElements end



    //CreditCard WebElements
    @FindBy(id = "B2CCreditCardRadioButton")
    public WebElement creditCardButton;
    @FindBy(css = "input[placeholder='Card #']")
    public WebElement creditCardNumber;
    @FindBy(css = "input[placeholder='CVV']")
    public WebElement creditCardCCV;
    @FindBy(name = "cname_0")
    public WebElement creditCardNameOnCard;
    @FindBy(name = "zip_0")
    public WebElement postalCodeCreditCard;
    @FindBy(name = "str_0")
    public WebElement billingAddress;
    @FindBy(name = "cty_0")
    public WebElement cityCreditCard;
    @FindBy(name = "exp_m_0")
    public WebElement cCardExpMonth;
    @FindBy(name = "exp_y_0")
    public WebElement cCardExpYear;
    //Credit cardWebElements End
    @FindBy(css = "#addCarTravelTypeDiv button")
    public WebElement addCarButton;
    @FindBy(css = "#addHotelTravelTypeDiv button")
    public WebElement addHotelButton;

    //Select Seats
    @FindBy(id = "seatSelectionBtn")
    public WebElement selectSeatBtn;
    @FindBy(css = ".active.bottom div.airplane span[data-code]")
    public List<WebElement> listOfAllSeats;
    @FindBy(css = "div[data-tab='flight-tab-0'] button.save-seats")
    public WebElement saveSeatSelectedButton;

    //select seats end
    @FindBy(id = "cbRules")
    public WebElement termsAndConditions;
    @FindBy(id = "CUSTOM_FIELD_834-0")
    public WebElement customFiledCCV_fourNumberAmexCard;
    @FindBy(id = "btnCreateBooking")
    public WebElement confirmBtn;
    @FindBy(css = ".waitScreen")
    public WebElement loadingScreen;
}