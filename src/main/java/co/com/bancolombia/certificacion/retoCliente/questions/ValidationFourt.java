package co.com.bancolombia.certificacion.retoCliente.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certificacion.retoCliente.userinterfaces.DataMissing.*;

public class ValidationFourt implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(VALIDATE_FOUR).viewedBy(actor).resolve();
    }

    public static ValidationFourt number(){
        return new ValidationFourt();
    }
}
