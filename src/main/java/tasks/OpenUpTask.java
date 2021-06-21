package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.Utestpage;

public class OpenUpTask implements Task {
    private Utestpage Utestpage;
    public static OpenUpTask thepage() {
        return Tasks.instrumented(OpenUpTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(Utestpage));
    }
}
