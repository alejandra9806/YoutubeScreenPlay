package com.youtube.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.UI.CancionDetailsUI.LBL_CANCIONSELECT;

public class CancionValidateQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cancion2 = LBL_CANCIONSELECT.resolveFor(actor).getText();
        System.out.println(cancion2);
        String cancionSelected=actor.recall("cancion");
        System.out.println(cancionSelected);
        return cancionSelected.equals(cancion2);
    }
    public static Question<Boolean> from(){
        return new CancionValidateQuestion();
    }
}
