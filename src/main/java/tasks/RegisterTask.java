package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.UtestFormPage;

public class RegisterTask implements Task {
private final String  strNombre;
private final String  strApellido;
private final String  strEmail;
private final String  f_ano;
private final String  f_dia;
private final String  f_mes;
private final String  idiomas;
private final String  ciudad;
private final String  codigoPostal;
private final String  pais;
private final String  pc;
private final String  version;
private final String  lenguaje_disp;
private final String  dispMovil;
private final String  modelMovil;
private final String  soMovil;
private final String  strContrasena;
private final String  strConfirmarContrasena;

    public RegisterTask(String strNombre, String strApellido, String strEmail, String f_ano, String f_dia, String f_mes, String idiomas, String ciudad, String codigoPostal, String pais, String pc, String version, String lenguaje_disp, String dispMovil, String modelMovil, String soMovil,  String strContrasena, String strConfirmarContrasena) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strEmail = strEmail;
        this.f_ano = f_ano;
        this.f_dia = f_dia;
        this.f_mes = f_mes;
        this.idiomas = idiomas;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.pc = pc;
        this.version = version;
        this.lenguaje_disp = lenguaje_disp;
        this.dispMovil = dispMovil;
        this.modelMovil = modelMovil;
        this.soMovil = soMovil;
        this.strContrasena = strContrasena;
        this.strConfirmarContrasena = strConfirmarContrasena;
    }
    public static Performable registrarUsuario (String strNombre, String strApellido, String strEmail, String f_ano, String f_dia, String f_mes, String idiomas, String ciudad, String codigoPostal, String pais, String pc, String version, String lenguaje_disp, String dispMovil, String modelMovil, String soMovil, String strContrasena, String strConfirmarContrasena){
        return Tasks.instrumented(RegisterTask.class,strNombre,strApellido,strEmail,f_ano,f_dia,f_mes,idiomas,ciudad,codigoPostal,pais, pc,version,lenguaje_disp,dispMovil,modelMovil, soMovil, strContrasena, strConfirmarContrasena);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestFormPage.REGISTER_BUTTON),
                Enter.theValue("strNombre").into(UtestFormPage.INPUT_NAME),
                Enter.theValue("strApellido").into(UtestFormPage.INPUT_LASTNAME),
                Enter.theValue("strEmail").into(UtestFormPage.INPUT_EMAIL),
                Enter.theValue("f_ano").into(UtestFormPage.INPUT_DATE_MONTH),
                Enter.theValue("f_dia").into(UtestFormPage.INPUT_DATE_DAY),
                Enter.theValue("f_mes").into(UtestFormPage.INPUT_DATE_YEAR),
                Enter.theValue("idiomas").into(UtestFormPage.INPUT_LENGUAGES),
                Click.on(UtestFormPage.NEXT_lOCATION_BUTTON ),
                Enter.theValue("ciudad").into(UtestFormPage.INPUT_CITY),
                Enter.theValue("codigoPostal").into(UtestFormPage.INPUT_POSTAL_CODE),
                Enter.theValue("pais").into(UtestFormPage.INPUT_COUNTRY),
                Click.on(UtestFormPage.NEXT_DEVICES_BUTTON ),
                Enter.theValue("pc").into(UtestFormPage.INPUT_COMPUTER),
                Enter.theValue("version").into(UtestFormPage.INPUT_VERSION),
                Enter.theValue("lenguaje_disp").into(UtestFormPage.INPUT_LENGUAGE_DEVICES),
                Enter.theValue("dispMovil").into(UtestFormPage.INPUT_MOBILE_DEVICES),
                Enter.theValue("modelMovil").into(UtestFormPage.INPUT_MODEL_MOVIL),
                Enter.theValue("soMovil").into(UtestFormPage.INPUT_SO_MOVIL),
                Click.on(UtestFormPage.NEXT_LAST_SPET_BUTTON),
                Enter.theValue("strContrasena").into(UtestFormPage.INPUT_PASSWORD),
                Enter.theValue("strConfirmarContrasena").into(UtestFormPage.INPUT_PASSWORD_CONFIRM));

    }
}
