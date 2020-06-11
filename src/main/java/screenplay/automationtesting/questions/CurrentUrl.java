package screenplay.automationtesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
public class CurrentUrl implements Question<String> {
    public String answeredBy(Actor actor){
        WebDriver driver = getDriver();

        return driver.getCurrentUrl();
    }
    public static screenplay.automationtesting.questions.CurrentUrl information(){
        return new screenplay.automationtesting.questions.CurrentUrl();
    }
}
