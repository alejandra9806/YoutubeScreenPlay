package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CancionDetailsUI {
    public static Target LBL_CANCIONSELECT=Target.the("cancion seleccionada")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");
}
