package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.HomePage;
import userinterface.UtestFormPage;

public class RegisterQuestions implements Question<Boolean> {
    private String question;
    public RegisterQuestions(String question){
        this.question = question;
    }
    public static RegisterQuestions toThe(String question) {
        return new RegisterQuestions(question);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String nameCourse= Text.of(HomePage.TEXT_VALID).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }else{
            result = false;
        }
        return null;
    }
}
