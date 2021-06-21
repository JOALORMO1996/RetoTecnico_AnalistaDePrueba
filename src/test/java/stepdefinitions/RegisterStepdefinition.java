package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.utestData;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUpTask;
import tasks.RegisterTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class RegisterStepdefinition {
    @Before
    public void setUp (){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que el usuario accede al formulartio de registro$")
    public void que_el_usuario_accede_al_formulartio_de_registro() {
        OnStage.theActorCalled(  "usuario").wasAbleTo(OpenUpTask.thepage());



    }

    @When("^ El usuario dilingencia los datos (.+), (.+), (.+), (.+) y (.+)$")
    public void el_usuario_dilingencia_los_datos_y(String strNombre, String strApellido, String strEmail, String f_ano, String f_dia, String f_mes, String idiomas, String ciudad, String codigoPostal, String pais, String pc, String version, String lenguaje_disp, String dispMovil, String modelMovil, String soMovil, String strContrasena, String strConfirmarContrasena)  {
            theActorCalled("usuario").attemptsTo(RegisterTask.registrarUsuario(strNombre,strApellido,strEmail,f_ano,f_dia,f_mes,idiomas,ciudad,codigoPostal,pais, pc,version,lenguaje_disp,dispMovil,modelMovil, soMovil, strContrasena, strConfirmarContrasena));
    }

    @Then("^ el ve su cuenta creada$")
    public void el_ve_su_cuenta_creada()  {

    }



}


