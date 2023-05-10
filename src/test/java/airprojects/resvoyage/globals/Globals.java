package airprojects.resvoyage.globals;

import java.util.ArrayList;
import java.util.List;


public class Globals {
    public static String baseUrl = "https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us";
    public static String driverType = "chrome";
    public static List<String> userCheckIfNamesList = new ArrayList<>(){{
        add(passe1Name);add(passe3Name);add(child2Name);add(passe1Email);
        add(passe2Name);add(child1BDay);add(inf1Name);
    }};


    //Credit Card Info:
    public static String creditCardNumber = "5555341244441115";
    public static String creditCardHolderName = "John Doe";
    public static String creditCardCVC = "737";
    public static String creditCardEXPMonth = "9";
    public static String creditCardEXPYear = "2023";
    public static String creditCardZIP = "1001";
    public static String creditCardCity = "NY";


    // Passenger 1 data:
    public static String passe1Name = "Endri";
    public static String passe1SurName = "Kasa";
    public static String passe1Email = "eksodiaeksodia1@gmail.com";
    public static String passe1Phone = "3556912345";
    public static char passe1Gender = 'M';
    public static String  passe1BDay = "14";
    public static String  passe1BMonth = "9";
    public static String passe1BYear = "1999";
    // Pass 1 data end.
    // Passenger 2 data:
    public static String passe2Name = "Juxhin";
    public static String passe2SurName = "Gorenca";
    public static char passe2Gender = 'M';
    public static String  passe2BDay = "23";
    public static String  passe2BMonth = "11";
    public static String passe2BYear = "1999";
    //Pass 2 data end

    //Pass 3 data Start
    public static String passe3Name = "Barbi";
    public static String passe3SurName = "Velo";
    public static char passe3Gender = 'M';
    public static String  passe3BDay = "9";
    public static String  passe3BMonth = "8";
    public static String passe3BYear = "1998";
    //Pass 3 data end

    //Pass child1 data Start
    public static String child1Name = "Klinti";
    public static String child1SurName = "Velo";
    public static char child1Gender = 'M';
    public static String  child1BDay = "9";
    public static String  child1BMonth = "8";
    public static String child1BYear = "2015";
    public static int child1Age = 8;
    //Pass child1 data end

    //Pass child2 data Start
    public static String child2Name = "Dea";
    public static String child2SurName = "Kacuri";
    public static char child2Gender = 'F';
    public static String  child2BDay = "13";
    public static String  child2BMonth = "4";
    public static String child2BYear = "2018";
    public static int child2Age = 5;
    //pass child2 data end

    //pass infant1 data start
    public static String inf1Name = "Ana";
    public static String inf1SName = "Kasa";
    public static char inf1Gender= 'F';
    public static String inf1BDay = "1";
    public static String inf1BMonth = "1";
    public static String inf1BYear = "2022";
    //pass infant1 data end

    public static String seatSelectionCode = "22A";
    public static String fourNumberAmexCardCode = "1111";
}
