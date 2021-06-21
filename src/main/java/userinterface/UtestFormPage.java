package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestFormPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("boton que nos lleva al formulario para crear usurio")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_NAME = Target.the("ingresa el nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("ingresa el apellido")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("ingresa el correo electronico")
            .located(By.id("email"));

    public static final Target INPUT_DATE_MONTH =Target.the("ingresa mes de nacimiento")
            .located(By.cssSelector("select#birthMonth"));
    public static final Target INPUT_DATE_DAY =Target.the("ingresa dia de nacimiento")
            .located(By.cssSelector("select#birthDay"));
    public static final Target INPUT_DATE_YEAR =Target.the("ingresa año de nacimiento")
            .located(By.cssSelector("select#birthYear"));

    public static final Target INPUT_LENGUAGES = Target.the("ingresa el/los idiomas")
            .located(By.cssSelector("select#languages"));

    public static final Target NEXT_lOCATION_BUTTON = Target.the("boton que nos lleva al formulario para diligenciar la locacion")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the("ingresa la ciudad")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("ingresa el codigo postal")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("ingresa o selecciona el pais")
            .located(By.id("focusser-52"));

    public static final Target NEXT_DEVICES_BUTTON= Target.the("boton que nos lleva al formulario para diligenciar los dispositivos")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));

    public static final Target INPUT_COMPUTER= Target.the("ingresa o selecciona el pc")
            .located(By.id("focusser-53"));

    public static final Target INPUT_VERSION= Target.the("ingresa o selecciona version")
            .located(By.id("focusser-54"));

    public static final Target INPUT_LENGUAGE_DEVICES= Target.the("ingresa o selecciona el lenguaje")
            .located(By.id("focusser-55"));

    public static final Target INPUT_MOBILE_DEVICES= Target.the("ingresa o selecciona el dispositivo movil")
            .located(By.id("focusser-56"));

    public static final Target INPUT_MODEL_MOVIL= Target.the("ingresa o selecciona el modelo del movil")
            .located(By.id("focusser-57"));

    public static final Target INPUT_SO_MOVIL= Target.the("ingresa o selecciona el SO del movil")
            .located(By.id("focusser-58"));

    public static final Target NEXT_LAST_SPET_BUTTON= Target.the("boton que nos lleva al formulario para diligenciar la contraseña")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD= Target.the("ingresa la contraseña")
            .located(By.id("password"));

    public static final Target INPUT_PASSWORD_CONFIRM= Target.the("confirma la contraseña")
            .located(By.id("confirmPassword"));
}