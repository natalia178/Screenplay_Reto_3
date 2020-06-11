package screenplay.automationtesting.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import screenplay.automationtesting.user_interface.ComponentofHospitalPage;

public class Navigate implements Performable {
    private  Class  refClazz   ;
    public static Performable theComponet() {
        return new screenplay.automationtesting.actions.Navigate(ComponentofHospitalPage.class);
    }

    public Navigate(Class refClazz) {
        this.refClazz = refClazz;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(refClazz)
        );
    }
}
