package com.youtube.UI;

import com.youtube.Models.DataModel;
import net.serenitybdd.screenplay.targets.Target;

public class CancionesUI {
    public static Target LBL_CANCIONES=Target.the("lista de canciones")
            .locatedBy("//yt-formatted-string[contains(text(),'"+DataModel.getFiltro()+"')]");
    //"//yt-formatted-string[starts-with(text(),'"+DataModel.getFiltro()+"')]"
}
