package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TEXT_VALID = Target.the("el usuario visualiza la pagina principal ")
            .located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
