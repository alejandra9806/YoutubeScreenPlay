package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {
    public static Target TXT_SEARCH=Target.the("input search")
            .locatedBy("//input[@id='search']");
}
