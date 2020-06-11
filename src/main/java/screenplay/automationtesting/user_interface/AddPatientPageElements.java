package screenplay.automationtesting.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPatientPageElements {
    public static Target FIELD_NAME    =  Target.the(" field name ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[1]/input")) ;
    public static Target FIELD_LAST_NAME    =  Target.the(" field last name ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[2]/input")) ;
    public static Target FIELD_PHONE    =  Target.the(" field  phone ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[3]/input")) ;
    public static Target CMBX_DNI    =  Target.the(" field type DNI ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[4]/select")) ;
    public static Target FIELD_DNI    =  Target.the(" field DNI ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[5]/input")) ;
    public static Target CHK_HEALTH_PAYMENT    =  Target.the(" field DNI ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/div[6]/label/input")) ;
    public static Target BTN_SAVE = Target.the("btn save ").located(By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a"));

}
