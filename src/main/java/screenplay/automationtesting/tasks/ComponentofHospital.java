package screenplay.automationtesting.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import screenplay.automationtesting.actions.Navigate;
import screenplay.automationtesting.user_interface.ComponentofHospitalPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ComponentofHospital implements   Task {

    private final int id_componet;
    private final String  name_componet;


    @Step("{0} Select componet::  name '#name_componet_name'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Navigate.theComponet(),
                Click.on(
                        ComponentofHospitalPageElements.getElemetsn(ComponentofHospitalPageElements.TypeComponentofHospital.fromValue(id_componet)))
        );
    }
    public ComponentofHospital(int id_componet, String name_componet) {
        this.id_componet = id_componet;
        this.name_componet = name_componet;
    }
    public static ComponentofHospital selectComponet(ComponentofHospitalPageElements.TypeComponentofHospital tycoh) {
        return instrumented(ComponentofHospital.class, tycoh.getId(),tycoh.getName());
    }

}
