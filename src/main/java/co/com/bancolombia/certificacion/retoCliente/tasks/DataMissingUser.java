package co.com.bancolombia.certificacion.retoCliente.tasks;

import co.com.bancolombia.certificacion.retoCliente.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.retoCliente.userinterfaces.DataMissing.*;

public class DataMissingUser implements Task {

    private final String password;
    private final String confirmPassword;

    public DataMissingUser(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_FINISH),
                Enter.theValue(password).into(PASSWORD_USER),
                Enter.theValue(confirmPassword).into(CONFIRM_PASSWORD_USER),
                Click.on(CHECK_TERMS_USER),
                Click.on(CHECK_PRIVACITY_USER)
                );
    }

    public static DataMissingUser inTheFields(DataUser data){
        return Tasks.instrumented(DataMissingUser.class, data.getPassword(), data.getConfirmPassword());
    }
}
