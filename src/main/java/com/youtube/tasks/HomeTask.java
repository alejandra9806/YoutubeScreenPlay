package com.youtube.tasks;

import com.youtube.Models.DataModel;
import com.youtube.interactions.GetText;
import com.youtube.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.youtube.UI.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url("https://www.youtube.com"),
                GetText.getText(),
                //Enter.theValue(DataModel.getFiltro()).into(TXT_SEARCH).thenHit(Keys.ENTER)
                Enter.theValue(Data.extractTo().get(0).get("Cancion")).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static HomeTask on(){
        return instrumented(HomeTask.class);
    }
}
