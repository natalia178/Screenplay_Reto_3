package screenplay.automationtesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.actions.DoubleClick;
import screenplay.automationtesting.user_interface.AddPatientPageElements;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterPatient implements Task {
    private final String name;
    private final String last_name;
    private final String phone;
    private final String type_dni;
    private final String dni_id;
    private final boolean isChkHealthPay ;

    public RegisterPatient(String name, String last_name, String phone, String type_dni, String dni_id, boolean isChkHealthPay) {
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.type_dni = type_dni;

        this.dni_id = dni_id;
        this.isChkHealthPay = isChkHealthPay;
    }

    @Step("{1} load patient data::  "
            + "name '#name'"
            + "name '#last_name'"
            + "name '#phone'"
            + "type  dni '#type_dni'"
            + "id  dni '#dni_id'"
    )
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddPatientPageElements.FIELD_NAME),
               SendKeys.of(name).into(AddPatientPageElements.FIELD_NAME),
                Click.on(AddPatientPageElements.FIELD_LAST_NAME),
                SendKeys.of(last_name).into(AddPatientPageElements.FIELD_LAST_NAME),

                Click.on(AddPatientPageElements.FIELD_PHONE),
                SendKeys.of(phone).into(AddPatientPageElements.FIELD_PHONE),

                Click.on(AddPatientPageElements.CMBX_DNI),
                SelectFromOptions.byVisibleText(type_dni).from(AddPatientPageElements.CMBX_DNI),

                Click.on(AddPatientPageElements.FIELD_DNI),
                SendKeys.of(dni_id).into(AddPatientPageElements.FIELD_DNI),

                isChk(isChkHealthPay , AddPatientPageElements.CHK_HEALTH_PAYMENT),
                Click.on(AddPatientPageElements.BTN_SAVE)
        );
    }

    public Interaction isChk(boolean isChk , Target target) {
        return isChk ?  Click.on(target) : DoubleClick.on(target);
    }

    public static RegisterPatient loadDataPatient(String name, String last_name, String phone, String type_dni, String dni_id, boolean  isChkHealthPay) {
        return instrumented(RegisterPatient.class, name, last_name, phone, type_dni, dni_id, isChkHealthPay);
    }
}

