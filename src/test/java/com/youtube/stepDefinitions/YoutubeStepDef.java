package com.youtube.stepDefinitions;

import com.youtube.questions.CancionValidateQuestion;
import com.youtube.tasks.CancionesSelectTask;
import com.youtube.tasks.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class YoutubeStepDef {
    @Before
    public void setupActor() {
        //WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingresa a la pagina de Youtube")
    public void queElUsuarioIngresaALaPaginaDeYoutube() {
        theActorCalled("user").wasAbleTo(
                HomeTask.on()
        );
    }
    @Cuando("el usuario realiza una busqueda y selecciona una cancion aleatoria")
    public void elUsuarioRealizaUnaBusquedaYSeleccionaUnaCancionAleatoria() {
        theActorInTheSpotlight().attemptsTo(
                CancionesSelectTask.on()
        );
    }
    @Entonces("el usuario podra visualizar el titulo de la cancion")
    public void elUsuarioPodraVisualizarElTituloDeLaCancion() {
        theActorInTheSpotlight().should(
                seeThat(
                        CancionValidateQuestion.from(),
                        Matchers.equalTo(true)
                )

        );
    }
}
