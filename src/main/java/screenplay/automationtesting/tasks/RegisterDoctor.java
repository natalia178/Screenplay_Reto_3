package screenplay.automationtesting.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import screenplay.automationtesting.user_interface.AddDoctorPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterDoctor implements Task {
    private final String name;
    private final String last_name;
    private final String phone;
    private final String type_dni;
    private final String dni_id;
    public RegisterDoctor(String name, String last_name, String phone, String type_dni, String dni_id) {
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.type_dni = type_dni;
        this.dni_id = dni_id;
    }
    @Step("{1} load doctor data::  "
            + "name '#name'"
            + "name '#last_name'"
            + "name '#phone'"
            + "type  dni '#type_dni'"
            + "id  dni '#dni_id'"
    )
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddDoctorPageElements.FIELD_NAME),
                SendKeys.of(name).into(AddDoctorPageElements.FIELD_NAME),

                Click.on(AddDoctorPageElements.FIELD_LAST_NAME),
                SendKeys.of(last_name).into(AddDoctorPageElements.FIELD_LAST_NAME),

                Click.on(AddDoctorPageElements.FIELD_PHONE),
                SendKeys.of(phone).into(AddDoctorPageElements.FIELD_PHONE),

                Click.on(AddDoctorPageElements.CMBX_DNI),
                SelectFromOptions.byVisibleText(type_dni).from(AddDoctorPageElements.CMBX_DNI),

                Click.on(AddDoctorPageElements.FIELD_DNI),
                SendKeys.of(dni_id).into(AddDoctorPageElements.FIELD_DNI),

                Click.on(AddDoctorPageElements.BTN_SAVE)
        );
    }


    public static RegisterDoctor loadData(String name, String last_name, String phone, String type_dni, String dni_id) {
        return instrumented(RegisterDoctor.class, name, last_name, phone, type_dni, dni_id);
    }
}
