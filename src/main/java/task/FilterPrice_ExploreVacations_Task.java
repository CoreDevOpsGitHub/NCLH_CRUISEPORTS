package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static org.openqa.selenium.Keys.ENTER;
import static user_interface.ExploreVacationsPage.MAX_PRICE_INPUT;
import static user_interface.ExploreVacationsPage.MORE_FILTERS_BUTTON;
import static user_interface.ShoreExcursionPage.DESTINATION_DROPDOWN_TEXTFEILD;

public class FilterPrice_ExploreVacations_Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MORE_FILTERS_BUTTON));
        actor.attemptsTo(Enter.theValue("1500").into(MAX_PRICE_INPUT).thenHit(ENTER));
    }


    public static FilterPrice_ExploreVacations_Task goesTo() {
        return Tasks.instrumented(FilterPrice_ExploreVacations_Task.class);

    }
}


