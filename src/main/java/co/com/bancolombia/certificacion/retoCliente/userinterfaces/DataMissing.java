package co.com.bancolombia.certificacion.retoCliente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataMissing {
    public static final Target BTN_FINISH = Target.the("button finish").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target PASSWORD_USER = Target.the("password user").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_USER = Target.the("confirm password user").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_USER = Target.the("check terms user").located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACITY_USER = Target.the("check privacity user").located(By.id("privacySetting"));
    public static final Target VALIDATE_FOUR = Target.the("validate four").located(By.xpath("//li[@class='circle current']/span[contains(text(), '4')]"));

}
