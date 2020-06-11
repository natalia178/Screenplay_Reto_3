package screenplay.automationtesting.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AppointmentSchedulingElements {
    public static Target FIELD_DATE    =  Target.the(" field name ").located(By.xpath("//*[@id=\"datepicker\"]")) ;
    public static Target FIELD_ID_PATIENT    =  Target.the(" field last name ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")) ;
    public static Target FIELD_ID_DOCTOR    =  Target.the(" field  phone ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")) ;
    public static Target FIELD_DESCRIPTION    =  Target.the(" field  description ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/textarea")) ;
    public static Target BTN_SAVE = Target.the("btn save ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
}
