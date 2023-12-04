package com.youtube.tasks;

import com.youtube.interactions.GetNameCancion;
import com.youtube.interactions.SelectRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancionesSelectTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectRandom.click(),
                GetNameCancion.getName()
        );
    }
    public static CancionesSelectTask on(){
        return instrumented(CancionesSelectTask.class);
    }
}
