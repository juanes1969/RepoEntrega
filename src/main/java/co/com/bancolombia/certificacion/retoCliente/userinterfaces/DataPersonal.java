package co.com.bancolombia.certificacion.retoCliente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPersonal {
    public static final Target BTN_START = Target.the("button start").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRST_NAME_USER = Target.the("first name user").located(By.id("firstName"));
    public static final Target LAST_NAME_USER = Target.the("last name user").located(By.id("lastName"));
    public static final Target EMAIL_NAME_USER = Target.the("email user").located(By.id("email"));
    public static final Target BIRTH_MONT_USER = Target.the("birth mont user").located(By.id("birthMonth"));
    public static final Target BIRTH_DAY_USER = Target.the("birth day user").located(By.id("birthDay"));
    public static final Target BIRTH_YEAR_USER = Target.the("birth year user").located(By.id("birthYear"));
    public static final Target BTN_NEXT = Target.the("button start").located(By.xpath("//a[@class='btn btn-blue']"));


}
