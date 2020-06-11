package screenplay.automationtesting.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPageElements {

    public static Target FIELD_NAME    =  Target.the(" field name ").located(By.xpath("//*[@id=\"name\"]")) ;
    public static Target FIELD_LAST_NAME    =  Target.the(" field last name ").located(By.xpath("//*[@id=\"last_name\"]")) ;
    public static Target FIELD_PHONE    =  Target.the(" field  phone ").located(By.xpath("//*[@id=\"telephone\"]")) ;
    public static Target CMBX_DNI    =  Target.the(" field type DNI ").located(By.xpath("//*[@id=\"identification_type\"]")) ;
    public static Target FIELD_DNI    =  Target.the(" field DNI ").located(By.xpath("//*[@id=\"identification\"]")) ;
    public static Target BTN_SAVE = Target.the("btn save ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));
}
