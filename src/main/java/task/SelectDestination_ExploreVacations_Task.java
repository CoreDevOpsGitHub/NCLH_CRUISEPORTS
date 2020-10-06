package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static user_interface.ExploreVacationsPage.MORE_FILTERS_BUTTON;
import static user_interface.HomePage.*;
import static user_interface.ShoreExcursionPage.DESTINATION_DROPDOWN;
import static user_interface.ShoreExcursionPage.DESTINATION_DROPDOWN_TEXTFEILD;

public class SelectDestination_ExploreVacations_Task implements Task {

    private String destination_from_task;

    public SelectDestination_ExploreVacations_Task(String destination_from_feature) {
        this.destination_from_task = destination_from_feature;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        //This select the drop down
        actor.attemptsTo(Click.on(DESTINATION_HOMEPAGE_CHECKBOX_DROPDOWN));

        //This select the checkbox
         actor.attemptsTo(Click.on(DESTINATION_HOMEPAGE_CHECKBOX_SELECTION.of(destination_from_task)));

        //This is to select apply
        actor.attemptsTo(Click.on(DESTINATION_HOMEPAGE_APPLY_BUTTON));

        //This is to click on find a cruise
        actor.attemptsTo(Click.on(FIND_A_CRUISE_BUTTON));

      //  actor.attemptsTo(Click.on(MORE_FILTERS_BUTTON));

    }


    public static SelectDestination_ExploreVacations_Task choosedestination(String destination_from_feature) {
        return Tasks.instrumented(SelectDestination_ExploreVacations_Task.class, destination_from_feature);
    }

}
