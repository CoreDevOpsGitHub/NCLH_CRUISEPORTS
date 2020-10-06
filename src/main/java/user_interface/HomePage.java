package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    //THIS IS THE HOMEPAGE URL
    public static final String URL = "https://www.ncl.com/";

    //THIS IS THE "ID" TO SELECT THE SHORE_EXCURSION LINK
    public static final Target SHORE_EXCURSION_LINK = Target.the("Shore_Excursion_Link_Tag").
            locatedBy("//a[@title='Explore Shore Excursions -Title']");

    //THIS IS THE "ID" TO SELECT THE "DESTINATION" DROP DOWN
    public static final Target DESTINATION_HOMEPAGE_CHECKBOX_DROPDOWN = Target.the("DESTINATION_HOMEPAGE_CHECKBOX_DROPDOWN").
            locatedBy("//span[text()='Destination']");

    //THIS IS THE "ID" TO SELECT THE "DESTINATION CHECKBOX" DROP DOWN
    public static final Target DESTINATION_HOMEPAGE_CHECKBOX_SELECTION = Target.the("DESTINATION_HOMEPAGE_CHECKBOX_SELECTION").
            locatedBy("(//span[text()='Hawaii Cruises'])");

    //THIS IS THE "ID" TO SELECT THE "APPLY" BUTTON WITHIN THE DESTINATION DROPDOWN
    public static final Target DESTINATION_HOMEPAGE_APPLY_BUTTON = Target.the("DESTINATION_HOMEPAGE_APPLY_BUTTON").
            locatedBy("(//a[@data-action='apply'])");

    //THIS IS THE "ID" TO FIND A CRUISE
    public static final Target FIND_A_CRUISE_BUTTON = Target.the("FIND_A_CRUISE_BUTTON").
            locatedBy("(//a[@data-action='find-a-cruise'])");

}

