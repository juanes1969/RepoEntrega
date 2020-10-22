package co.com.bancolombia.certificacion.retoCliente.tasks;

import co.com.bancolombia.certificacion.retoCliente.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.bancolombia.certificacion.retoCliente.userinterfaces.DataPersonal.*;

public class DataPersonalUser implements Task {

    private final String name;
    private final String lastname;
    private final String email;

    public DataPersonalUser(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_START),
                Enter.theValue(name).into(FIRST_NAME_USER),
                Enter.theValue(lastname).into(LAST_NAME_USER),
                Enter.theValue(email).into(EMAIL_NAME_USER),
                SelectFromOptions.byVisibleText("November").from(BIRTH_MONT_USER),
                SelectFromOptions.byVisibleText("20").from(BIRTH_DAY_USER),
                SelectFromOptions.byVisibleText("1999").from(BIRTH_YEAR_USER),
                Click.on(BTN_NEXT)
        );
    }

    public static DataPersonalUser inFields(DataUser data){
        return Tasks.instrumented(DataPersonalUser.class,
                data.getName(),
                data.getLastname(),
                data.getEmail());
    }
}
