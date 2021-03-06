package runners;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src\\test\\resources\\features\\RegisterUsuario.feature",
        tags ="{@stories}",
        glue = "src\\test\\java\\stepdefinitions"
)
public class RegisterRunner {
}
