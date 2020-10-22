package co.com.bancolombia.certificacion.retoCliente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataContact {
    public static final Target CITY_USER = Target.the("city user").located(By.id("city"));
    public static final Target CODE_POSTAL_USER = Target.the("code postal user").located(By.id("zip"));
    public static final Target BTN_NEXT = Target.the("button next").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
