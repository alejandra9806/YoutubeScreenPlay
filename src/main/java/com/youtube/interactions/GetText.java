package com.youtube.interactions;

import com.youtube.Models.DataModel;
import com.youtube.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetText implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        DataModel.setFiltro(Data.extractTo().get(0).get("Cancion"));
        System.out.println(DataModel.getFiltro());
    }
    public static GetText getText(){
        return instrumented(GetText.class);
    }
}
