package com.youtube.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.youtube.UI.CancionesUI.LBL_CANCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetNameCancion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nameCancion = LBL_CANCIONES.resolveFor(actor).getText();
        actor.remember("cancion",nameCancion);
    }
    public static GetNameCancion getName(){
        return instrumented(GetNameCancion.class);
    }
}
