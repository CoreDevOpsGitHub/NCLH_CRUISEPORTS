package user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class ExploreVacationsPage {

    //THIS IS THE "ID" TO SELECT THE "MORE FILTERS" BUTTON
    public static final Target MORE_FILTERS_BUTTON = Target.the("MORE_FILTERS_BUTTON_Tag").
            locatedBy("//span[text()='More Filters']");

    //THIS IS THE "ID" TO INSERT PRICE
    public static final Target MAX_PRICE_INPUT = Target.the("MAX_PRICE_INPUT_Tag").
            locatedBy("//input[@type='number']");

}
