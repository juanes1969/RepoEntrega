package co.com.bancolombia.certificacion.retoCliente.tasks;

import co.com.bancolombia.certificacion.retoCliente.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certificacion.retoCliente.userinterfaces.DataContact.*;

public class DataContactUser implements Task {

    private final String city;
    private final String codePostal;

    public DataContactUser(String city, String codePostal) {
        this.city = city;
        this.codePostal = codePostal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(CITY_USER),
                Enter.theValue(codePostal).into(CODE_POSTAL_USER),
                Click.on(BTN_NEXT));
    }

    public static DataContactUser inTheFields(DataUser data){
        return Tasks.instrumented(DataContactUser.class,
                data.getCity(),
                data.getCodePostal());
    }
}
